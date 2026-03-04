package com.happy.roomies.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UserInsertDTO(
        @NotBlank(message = "Email is required")
        @Email
        String email,

        @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
        @NotBlank
        String phoneNumber
) {}
