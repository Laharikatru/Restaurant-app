package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.CategoryTable;
import com.example.jpacrud.repository.CategoryTableRepository;

@Service
public class CategoryTableServiceImpl implements CategoryTableService {

    @Autowired
    private CategoryTableRepository repo;

    public List<CategoryTable> getall() { return repo.findAll(); }

    public Optional<CategoryTable> getbyId(int id) { return repo.findById(id); }

    public CategoryTable create(CategoryTable c) { return repo.save(c); }

    public CategoryTable update(CategoryTable c) { return repo.save(c); }

    public void delete(int id) { repo.deleteById(id); }
}