package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import com.example.jpacrud.model.OrderTable;

public interface OrderTableService {

    List<OrderTable> getall();
    Optional<OrderTable> getbyId(int id);
    OrderTable create(OrderTable o);
    OrderTable update(OrderTable o);
    void delete(int id);
}