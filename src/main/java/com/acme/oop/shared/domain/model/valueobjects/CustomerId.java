package com.acme.oop.shared.domain.model.valueobjects;
import java.util.UUID;

public record CustomerId(UUID value) {
    public CustomerId {
        if (value == null) {
            throw new IllegalArgumentException("Customer ID cannot be null");
        }
    }

    /**
     * Constructs a CustomerId with a randomly generated UUID.
     */
    public CustomerId() {
        this(UUID.randomUUID());
    }

}
