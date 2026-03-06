package com.happy.roomies.repository;

import com.happy.roomies.model.House;
import com.happy.roomies.model.Roommate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HouseRepository extends JpaRepository<House, Long>, JpaSpecificationExecutor<House> {


    List<House> findByOwner(Roommate owner);
    List<House> findByAddress(String address);
    List<House> findByNumOfRooms(Long numOfRooms);



}
