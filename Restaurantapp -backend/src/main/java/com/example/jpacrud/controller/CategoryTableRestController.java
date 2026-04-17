package com.example.jpacrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.CategoryTable;
import com.example.jpacrud.service.CategoryTableService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryTableRestController {

    @Autowired
    private CategoryTableService service;

    @GetMapping
    public List<CategoryTable> getAll() {
        return service.getall();
    }

    @GetMapping("/{id}")
    public Optional<CategoryTable> getById(@PathVariable int id) {
        return service.getbyId(id);
    }

    @PostMapping
    public CategoryTable create(@RequestBody CategoryTable c) {
        return service.create(c);
    }

    @PutMapping
    public CategoryTable update(@RequestBody CategoryTable c) {
        return service.update(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}