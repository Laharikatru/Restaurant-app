package com.example.jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jpacrud.model.MenuTable;
import com.example.jpacrud.service.MenuTableService;

@RestController
@RequestMapping("/menu")
@CrossOrigin("*")
public class MenuTableRestController {

    @Autowired
    private MenuTableService service;

    @GetMapping
    public List<MenuTable> getAll() {
        return service.getall();
    }

    @GetMapping("/category/{id}")
    public List<MenuTable> getByCategory(@PathVariable int id) {
        return service.getByCategoryId(id);
    }

    @PostMapping
    public MenuTable create(@RequestBody MenuTable m) {
        return service.create(m);
    }
}