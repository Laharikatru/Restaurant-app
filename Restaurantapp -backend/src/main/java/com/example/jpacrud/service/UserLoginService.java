package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import com.example.jpacrud.model.UserLogin;

public interface UserLoginService {

    List<UserLogin> getall();
    Optional<UserLogin> getbyId(int id);
    UserLogin create(UserLogin login);
    UserLogin update(UserLogin login);
    void delete(int id);
    Optional<UserLogin> findByUsername(String username);
}