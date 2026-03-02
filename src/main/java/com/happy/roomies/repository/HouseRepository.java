package com.happy.roomies.repository;

import com.happy.roomies.model.House;
import com.happy.roomies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface HouseRepository extends JpaRepository<House, Long>, JpaSpecificationExecutor<House> {


    List<House> findByOwner(User owner);
    List<House> findByAddress(String address);
    List<House> findByNumOfRooms(Long numOfRooms);



}
