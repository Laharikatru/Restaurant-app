package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import com.example.jpacrud.model.OrderDetails;

public interface OrderDetailsService {

    List<OrderDetails> getall();
    Optional<OrderDetails> getbyId(int id);
    OrderDetails create(OrderDetails o);
    OrderDetails update(OrderDetails o);
    void delete(int id);
}