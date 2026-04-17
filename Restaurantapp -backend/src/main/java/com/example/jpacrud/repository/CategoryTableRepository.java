package com.example.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpacrud.model.CategoryTable;

public interface CategoryTableRepository extends JpaRepository<CategoryTable, Integer> {
}