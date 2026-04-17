package com.example.jpacrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.MenuTable;
import com.example.jpacrud.repository.MenuTableRepository;

@Service
public class MenuTableServiceImpl implements MenuTableService {

    @Autowired
    private MenuTableRepository repo;

    @Override
    public List<MenuTable> getall() {
        return repo.findAll();
    }

    @Override
    public List<MenuTable> getByCategoryId(int id) {
        return repo.findByCategory_Id(id);
    }

    @Override
    public MenuTable create(MenuTable m) {
        return repo.save(m);
    }
}