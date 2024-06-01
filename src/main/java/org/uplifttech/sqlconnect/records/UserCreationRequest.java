package org.uplifttech.sqlconnect.records;

public record UserCreationRequest(
        String name,
        String email
) {
}
