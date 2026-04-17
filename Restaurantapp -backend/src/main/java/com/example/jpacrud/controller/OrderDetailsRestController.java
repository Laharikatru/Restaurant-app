package com.example.jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.OrderDetails;
import com.example.jpacrud.service.OrderDetailsService;

@RestController
@RequestMapping("/orderdetails")
@CrossOrigin("*")
public class OrderDetailsRestController {

    @Autowired
    private OrderDetailsService service;

    @GetMapping
    public List<OrderDetails> getAll() {
        return service.getall();
    }

    @PostMapping
    public OrderDetails create(@RequestBody OrderDetails o) {
        return service.create(o);
    }
}