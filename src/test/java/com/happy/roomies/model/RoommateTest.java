package com.happy.roomies.model;

import com.happy.roomies.core.enums.Gender;
import com.happy.roomies.util.TestDataFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class RoommateTest {



    /**
     * Tests the default (no-args) constructor of Roommate
     * and verifies that setters correctly assign values.
     */

    @Test
    void defaultConstructor(){
        User user = TestDataFactory.createDefaultUser();
        House house = TestDataFactory.createDefaultHouse();

        //act
        Roommate roommate = new Roommate();
        roommate.setId(12L);
        roommate.setFirstname("Roommate1");
        roommate.setLastname("RoommateLast");
        roommate.setGender(Gender.FEMALE);
        roommate.setUser(user);
        roommate.setHouses(List.of(house));


        //assertion
        assertNotNull(user);
        assertNotNull(house);
        assertNotNull(roommate);

        assertEquals(12L,roommate.getId());
        assertEquals("Roommate1",roommate.getFirstname());
        assertEquals("RoommateLast",roommate.getLastname());
        assertEquals(Gender.FEMALE, roommate.getGender());
        assertEquals(user,roommate.getUser());
        assertEquals(List.of(house),roommate.getHouses());

    }


    /**
     * Tests the all-args constructor of Roommate
     * to ensure all fields are properly initialized.
     */
    @Test
    void allArgsConstructor(){
        User user = TestDataFactory.createDefaultUser();
        House house = TestDataFactory.createDefaultHouse();

        //act
        Roommate roommate = new Roommate(12L,"Roommate1",
                "RoommateLast",Gender.FEMALE,user,List.of(house));

        //assertion
        assertNotNull(user);
        assertNotNull(house);
        assertNotNull(roommate);

        assertEquals(12L,roommate.getId());
        assertEquals("Roommate1",roommate.getFirstname());
        assertEquals("RoommateLast",roommate.getLastname());
        assertEquals(Gender.FEMALE, roommate.getGender());
        assertEquals(user,roommate.getUser());
        assertEquals(List.of(house),roommate.getHouses());
    }

    /**
     * Checks if House is null in case when roommate has not entered it
     */
    @Test
    void houses_ShouldBeEmpty_WhenNotSet(){
        Roommate roommate = new Roommate();

        //assertion
        assertNull(roommate.getHouses());
    }
}
