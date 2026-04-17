package com.example.jpacrud.service;

import java.util.List;
import com.example.jpacrud.model.MenuTable;

public interface MenuTableService {

    List<MenuTable> getall();

    List<MenuTable> getByCategoryId(int id);

    MenuTable create(MenuTable m);
}