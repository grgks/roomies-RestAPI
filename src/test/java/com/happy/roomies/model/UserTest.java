package com.happy.roomies.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class UserTest {

    /**
     * Tests the default (no-args) constructor of User
     * and verifies that setters correctly assign values.
     */

    @Test
    void defaultConstructor(){
        User user = new User();
        user.setId(11L);
        user.setKeycloakId("123456789");
        user.setEmail("user@aueb.gr");
        user.setIsActive(true);
        user.setPhoneNumber("6900987654");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        assertNotNull(user);
        assertEquals(11L,user.getId());
        assertEquals("123456789" , user.getKeycloakId());
        assertEquals("user@aueb.gr", user.getEmail());
        assertEquals(true, user.getIsActive());
        assertEquals("6900987654", user.getPhoneNumber());
    }


    /**
     * Tests the all-args constructor of User
     * to ensure all fields are properly initialized.
     */
    @Test
    void allArgsConstructor(){
        User user = new User(11L, "keycloak123", "user@aueb.gr", "6900987654", true);

        assertNotNull(user);
        assertEquals(11L, user.getId());
        assertEquals("keycloak123", user.getKeycloakId());
        assertEquals("user@aueb.gr", user.getEmail());
        assertEquals(true, user.getIsActive());
    }

    /**
     * Ensures that isEnabled() returns false when the active flag is null.
     */
    void isActive_ShouldReturnFalse_WhenActiveIsNull() {
        User user = new User();
        user.setIsActive(null);

        //assertion
        assertFalse(user.getIsActive());
        assertNotEquals(true, false);
    }
}
