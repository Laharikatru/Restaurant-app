package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.OrderTable;
import com.example.jpacrud.repository.OrderTableRepository;

@Service
public class OrderTableServiceImpl implements OrderTableService {

    @Autowired
    private OrderTableRepository repo;

    public List<OrderTable> getall() { return repo.findAll(); }

    public Optional<OrderTable> getbyId(int id) { return repo.findById(id); }

    public OrderTable create(OrderTable o) { return repo.save(o); }

    public OrderTable update(OrderTable o) { return repo.save(o); }

    public void delete(int id) { repo.deleteById(id);
    }
    }
