package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.OrderDetails;
import com.example.jpacrud.repository.OrderDetailsRepository;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepository repo;

    public List<OrderDetails> getall() { return repo.findAll(); }

    public Optional<OrderDetails> getbyId(int id) { return repo.findById(id); }

    public OrderDetails create(OrderDetails o) { return repo.save(o); }

    public OrderDetails update(OrderDetails o) { return repo.save(o); }

    public void delete(int id) { repo.deleteById(id); }
}