package com.Khodyukevich.UUID;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class UUIDService {

    public UUID createId() {
        return UUID.randomUUID();
    }
}
