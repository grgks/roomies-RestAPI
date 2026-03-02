package com.happy.roomies.repository;

import com.happy.roomies.core.enums.Gender;
import com.happy.roomies.model.House;
import com.happy.roomies.model.Roommate;
import com.happy.roomies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface RoommateRepository extends JpaRepository<Roommate, Long>, JpaSpecificationExecutor<Roommate> {


    Optional<Roommate> findByUser(User user);
    Optional<Roommate> findByFirstname(String firstname);
    Optional<Roommate> findByLastname(String lastname);


    List<Roommate> findByHousesContaining(House house);
    List<Roommate> findByGender(Gender gender);




}
