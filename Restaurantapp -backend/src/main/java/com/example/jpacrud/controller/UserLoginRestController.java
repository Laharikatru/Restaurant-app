package com.example.jpacrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.UserLogin;
import com.example.jpacrud.service.UserLoginService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserLoginRestController {

    @Autowired
    private UserLoginService service;

    @GetMapping
    public List<UserLogin> getAll() {
        return service.getall();
    }

    @GetMapping("/{id}")
    public Optional<UserLogin> getById(@PathVariable int id) {
        return service.getbyId(id);
    }

    @PostMapping
    public UserLogin create(@RequestBody UserLogin user) {
        return service.create(user);
    }

    @PutMapping
    public UserLogin update(@RequestBody UserLogin user) {
        return service.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLogin req) {

        Optional<UserLogin> user = service.findByUsername(req.getUsername());

        if (user.isPresent() && user.get().getPassword().equals(req.getPassword())) {
            return ResponseEntity.ok("Login Success");
        } else {
            return ResponseEntity.status(401).body("Invalid Credentials");
        }
    }
}