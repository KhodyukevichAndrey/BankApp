package com.Khodyukevich.UUID;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UUIDService {

    public UUID createId() {
        return UUID.randomUUID();
    }
}
