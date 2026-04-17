package com.example.jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.OrderTable;
import com.example.jpacrud.service.OrderTableService;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class OrderTableRestController {

    @Autowired
    private OrderTableService service;

    @GetMapping
    public List<OrderTable> getAll() {
        return service.getall();
    }

    @PostMapping
    public OrderTable create(@RequestBody OrderTable o) {
        return service.create(o);
    }
}