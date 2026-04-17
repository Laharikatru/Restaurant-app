package com.example.jpacrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpacrud.model.MenuTable;

public interface MenuTableRepository extends JpaRepository<MenuTable, Integer> {

    // 🔥 Filter by category
    List<MenuTable> findByCategory_Id(int categoryId);
}