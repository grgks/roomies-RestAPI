package com.happy.roomies.model;

import com.happy.roomies.util.TestDataFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    /**
     * Tests the default (no-args) constructor of House
     * and verifies that setters correctly assign values.
     */

    @Test
    void defaultConstructor() {

        //create user
        Roommate john = TestDataFactory.createDefaultRoommate();


        //act
        House house = new House();
        house.setId(12L);
        house.setAddress("Unknown Street");
        house.setAddressNumber("12");
        house.setApartment("21B");
        house.setNumOfRooms(4L);
        house.setOwner(john);


        //assertion
        assertNotNull(house);
        assertNotNull(john);

        assertEquals(12L, house.getId());
        assertEquals("Unknown Street", house.getAddress());
        assertEquals("12", house.getAddressNumber());
        assertEquals("21B", house.getApartment());
        assertEquals(4L, house.getNumOfRooms());
        assertEquals(john, house.getOwner());
    }

        /**
         * Tests the all-args constructor of House
         * to ensure all fields are properly initialized.
         */
        @Test
        void allArgsConstructor(){
            Roommate roommate = TestDataFactory.createDefaultRoommate();

            //act
            House house = new House( 11L, "Unknown Street", "12", "21B", 4L, roommate );

            //assertion
            assertNotNull(roommate);
            assertNotNull(house);
            assertEquals(11L,house.getId());
            assertEquals("Unknown Street", house.getAddress());
            assertEquals("12", house.getAddressNumber());
            assertEquals("21B", house.getApartment());
            assertEquals(4L,house.getNumOfRooms());
            assertEquals(roommate, house.getOwner());
        }


    /**
     * Test if owner is not null
     */
    @Test
    void owner_ShouldNotBeNull() {
        House house = new House();
        house.setOwner(TestDataFactory.createDefaultRoommate());

        //assertion
        assertNotNull(house.getOwner());
    }

    /**
     * Test if owner is  null
     */
    @Test
    void owner_ShouldBeNull_WhenNotSet() {
        House house = new House();

        //assertion
        assertNull(house.getOwner());
    }
}
