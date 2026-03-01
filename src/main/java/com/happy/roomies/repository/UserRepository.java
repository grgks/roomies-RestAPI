package com.happy.roomies.repository;

import com.happy.roomies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
    Repository methods..The rest methods do not need because the fields like
    username / role / Uuid / and exists boolean methods will come from keycloak.
    For the same reason, User does not implement UserDetails. Authentication
    will be handled entirely by Keycloak via JWT token.

*/


@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    Optional<User> findByKeycloakId(String keycloak);
    Optional<User> findByEmail(String email);
    Optional<User> findByPhoneNumber(String phoneNumber);

    List<User> findByIsActiveTrue();
    List<User> findByIsActiveFalse();

    boolean existsByKeycloakId(String keycloakId);
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phoneNumber);

}
