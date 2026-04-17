package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import com.example.jpacrud.model.UserAddress;

public interface UserAddressService {

    List<UserAddress> getall();
    Optional<UserAddress> getbyId(int id);
    UserAddress create(UserAddress u);
    UserAddress update(UserAddress u);
    void delete(int id);
}