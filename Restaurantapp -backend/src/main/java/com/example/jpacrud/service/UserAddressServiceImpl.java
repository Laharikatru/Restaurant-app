package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.UserAddress;
import com.example.jpacrud.repository.UserAddressRepository;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressRepository repo;

    public List<UserAddress> getall() { return repo.findAll(); }

    public Optional<UserAddress> getbyId(int id) { return repo.findById(id); }

    public UserAddress create(UserAddress u) { return repo.save(u); }

    public UserAddress update(UserAddress u) { return repo.save(u); }

    public void delete(int id) { repo.deleteById(id); }
}