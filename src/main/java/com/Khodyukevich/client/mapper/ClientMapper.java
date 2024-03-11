package com.Khodyukevich.client.mapper;

import com.Khodyukevich.client.dto.ClientDto;
import com.Khodyukevich.client.dto.NewClientDto;
import com.Khodyukevich.client.model.Client;
import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class ClientMapper {

    public Client makeClient(UUID uuid, NewClientDto newClientDto) {
        return new Client(uuid,
                newClientDto.getFullName(),
                newClientDto.getPhoneNumber(),
                newClientDto.getEmail(),
                newClientDto.getPassport());
    }

    public ClientDto makeClientDto(Client client) {
        return new ClientDto(client.getFullName(),
                client.getPhoneNumber());
    }
}
