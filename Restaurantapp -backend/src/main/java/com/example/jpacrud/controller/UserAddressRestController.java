package com.example.jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.UserAddress;
import com.example.jpacrud.service.UserAddressService;

@RestController
@RequestMapping("/address")
@CrossOrigin("*")
public class UserAddressRestController {

    @Autowired
    private UserAddressService service;

    @GetMapping
    public List<UserAddress> getAll() {
        return service.getall();
    }

    @PostMapping
    public UserAddress create(@RequestBody UserAddress u) {
        return service.create(u);
    }
}