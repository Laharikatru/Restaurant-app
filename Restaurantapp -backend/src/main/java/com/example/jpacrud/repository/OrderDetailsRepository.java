package com.example.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpacrud.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}