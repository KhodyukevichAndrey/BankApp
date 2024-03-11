package com.Khodyukevich.client.storage;

import com.Khodyukevich.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientStorage extends JpaRepository<Client, UUID> {
}
