package com.vlsystem.api.email;

import java.util.Objects;

public record Email(String to, String subject, String body) {
    public Email {
        Objects.requireNonNull(to);
        Objects.requireNonNull(subject);
        Objects.requireNonNull(body);
    }
}