package com.happy.roomies.dto;

import java.time.LocalDateTime;

public record UserReadOnlyDTO(


        Long id,

        String keycloakId,

        String email,

        String phoneNumber,

        Boolean isActive,

        LocalDateTime createdAt,

        LocalDateTime updatedAt
) {}
