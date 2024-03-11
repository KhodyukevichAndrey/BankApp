package com.Khodyukevich.exception;

import javax.swing.text.html.parser.Entity;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(final String message) {
        super(message);
    }
}
