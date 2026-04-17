package com.example.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpacrud.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {
}