package com.example.jpacrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpacrud.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Integer> {
    Optional<UserLogin> findByUsername(String username);
}