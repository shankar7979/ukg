package com.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User1,Integer> {
    Optional<User1> findByName(String username);
}