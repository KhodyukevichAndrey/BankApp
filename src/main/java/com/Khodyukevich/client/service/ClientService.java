package com.Khodyukevich.client.service;

import com.Khodyukevich.client.dto.ClientDto;
import com.Khodyukevich.client.dto.NewClientDto;

import java.util.UUID;

public interface ClientService {
    ClientDto createClient(NewClientDto newClientDto);

    ClientDto updateClient(UUID uuid, NewClientDto newClientDto);

    void deleteClient(UUID uuid);

    ClientDto getClient(UUID uuid);
}
