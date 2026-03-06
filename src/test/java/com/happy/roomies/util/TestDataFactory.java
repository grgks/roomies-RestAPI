package com.happy.roomies.util;


import com.happy.roomies.core.enums.Gender;
import com.happy.roomies.model.House;
import com.happy.roomies.model.Roommate;
import com.happy.roomies.model.User;

import java.util.ArrayList;

/**
 * Factory class for creating test data objects with default values.
 * Reduces boilerplate code in tests.
 */
public class TestDataFactory {

    //Entities

    /**
     * Creates a default User
     */
    public static User createDefaultUser(){
        User user = new User();
        user.setId(13L);
        user.setKeycloakId("121-234-345-23a");
        user.setEmail("user@aueb.gr");
        user.setPhoneNumber("0987654321");
        user.setIsActive(true);
        return user;
    }

    /**
     * Creates a new default User without id
     */
    public static User createNewDefaultUser(){
        User user = new User();
        user.setKeycloakId("121-234-345-23a");
        user.setEmail("user@aueb.gr");
        user.setPhoneNumber("0987654321");
        user.setIsActive(true);
        return user;
    }

    /**
     * Creates a new default User without id
     */
    public static User createNewDefaultUser2(){
        User user = new User();
        user.setKeycloakId("165-234-985-23a");
        user.setEmail("user2@aueb.gr");
        user.setPhoneNumber("0987654385");
        user.setIsActive(true);
        return user;
    }

    /**
     * Creates a default House
     */
    public static House createDefaultHouse(){
        Roommate roommate = TestDataFactory.createDefaultRoommate();

        House house = new House();
        house.setId(12L);
        house.setAddress("Unknown Street");
        house.setAddressNumber("12");
        house.setApartment("21B");
        house.setNumOfRooms(4L);
        house.setOwner(roommate);
        return house;
    }

    /**
     * Creates a new default House without id
     */
    public static House createNewDefaultHouse() {
        House house = new House();
        house.setAddress("Unknown Street");
        house.setAddressNumber("12");
        house.setApartment("21B");
        house.setNumOfRooms(4L);
        return house;
    }

    /**
     * Creates a default Roommate with a default User
     */
    public static Roommate createDefaultRoommate() {
        User user = TestDataFactory.createDefaultUser();

        Roommate roommate = new Roommate();
        roommate.setId(12L);
        roommate.setFirstname("Roommate1");
        roommate.setLastname("RoommateLast");
        roommate.setGender(Gender.FEMALE);
        roommate.setUser(user);
        return roommate;
    }

    /**
     * Creates a new default Roommate without id
     */
    public static Roommate createNewDefaultRoommate() {
        Roommate roommate = new Roommate();
        roommate.setFirstname("Roommate1");
        roommate.setLastname("RoommateLast");
        roommate.setGender(Gender.FEMALE);
        roommate.setHouses(new ArrayList<>());
        return roommate;
    }
}
