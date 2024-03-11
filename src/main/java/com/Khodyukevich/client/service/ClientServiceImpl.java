package com.Khodyukevich.client.service;

import com.Khodyukevich.UUID.UUIDService;
import com.Khodyukevich.client.dto.ClientDto;
import com.Khodyukevich.client.dto.NewClientDto;
import com.Khodyukevich.client.mapper.ClientMapper;
import com.Khodyukevich.client.model.Client;
import com.Khodyukevich.client.storage.ClientStorage;
import com.Khodyukevich.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.Khodyukevich.constants.Errors.WRONG_USER_ID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientStorage clientStorage;
    private final UUIDService service;

    @Override
    public ClientDto createClient(NewClientDto newClientDto) {
        Client client = clientStorage.save(ClientMapper.makeClient(service.createId(), newClientDto));

        return ClientMapper.makeClientDto(client);
    }

    @Override
    public ClientDto updateClient(UUID uuid, NewClientDto newClientDto) {
        Client client = getClientByUUID(uuid);
        completeFields(client, newClientDto);

        return ClientMapper.makeClientDto(clientStorage.save(client));
    }

    @Override
    public void deleteClient(UUID uuid) {
        getClientByUUID(uuid);
        clientStorage.deleteById(uuid);
    }

    @Override
    public ClientDto getClient(UUID uuid) {
        return ClientMapper.makeClientDto(getClientByUUID(uuid));
    }

    private Client getClientByUUID(UUID uuid) {
        return clientStorage.findById(uuid)
                .orElseThrow(() -> new EntityNotFoundException(WRONG_USER_ID));
    }

    private void completeFields(Client client, NewClientDto newClientDto) {
        if (newClientDto.getFullName() != null && !newClientDto.getFullName().isBlank()) {
            client.setFullName(newClientDto.getFullName());
        }
        if (newClientDto.getPhoneNumber() != null && !newClientDto.getPhoneNumber().isBlank()) {
            client.setPhoneNumber(newClientDto.getPhoneNumber());
        }
        if (newClientDto.getEmail() != null && !newClientDto.getEmail().isBlank()) {
            client.setEmail(newClientDto.getEmail());
        }
        if (newClientDto.getPassport() != null) {
            client.setPassport(newClientDto.getPassport());
        }
    }
}
