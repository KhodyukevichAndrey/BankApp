package com.Khodyukevich.client.controller;

import com.Khodyukevich.client.dto.ClientDto;
import com.Khodyukevich.client.dto.NewClientDto;
import com.Khodyukevich.client.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(path = "/admin/clients")
@RequiredArgsConstructor
@Slf4j
public class ClientController {

    private final ClientService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDto createClient(@RequestBody @Valid NewClientDto newClientDto) {
        log.debug("Получен запрос Post /admin/clients");
        return service.createClient(newClientDto);
    }

    @PatchMapping("/{uuid}")
    public ClientDto updateClient(@PathVariable UUID uuid, @RequestBody @Valid NewClientDto newClientDto) {
        log.debug("Получен запрос Patch /admin/clients/{uuid}");
        return service.updateClient(uuid, newClientDto);
    }

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@PathVariable UUID uuid) {
        log.debug("Получен запрос Delete /admin/clients/{uuid}");
        service.deleteClient(uuid);
    }

    @GetMapping("/{uuid}")
    public ClientDto getClient(@PathVariable UUID uuid) {
        log.debug("Получен запрос Get /admin/clients/{uuid}");
        return service.getClient(uuid);
    }
}
