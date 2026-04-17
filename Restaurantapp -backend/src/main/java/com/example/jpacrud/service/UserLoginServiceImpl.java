package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.UserLogin;
import com.example.jpacrud.repository.UserLoginRepository;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginRepository repo;

    public List<UserLogin> getall() { return repo.findAll(); }

    public Optional<UserLogin> getbyId(int id) { return repo.findById(id); }

    public UserLogin create(UserLogin login) { return repo.save(login); }

    public UserLogin update(UserLogin login) { return repo.save(login); }

    public void delete(int id) { repo.deleteById(id); }

    public Optional<UserLogin> findByUsername(String username) {
        return repo.findByUsername(username);
    }
}