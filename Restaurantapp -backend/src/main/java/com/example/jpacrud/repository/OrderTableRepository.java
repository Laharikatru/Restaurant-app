package com.example.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpacrud.model.OrderTable;

public interface OrderTableRepository extends JpaRepository<OrderTable, Integer> {
}