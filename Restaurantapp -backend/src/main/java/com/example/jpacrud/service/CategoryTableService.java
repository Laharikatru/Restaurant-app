package com.example.jpacrud.service;
import java.util.List;
import java.util.Optional;

import com.example.jpacrud.model.CategoryTable;


public interface CategoryTableService {
	List<CategoryTable> getall();
    Optional<CategoryTable> getbyId(int id);
    CategoryTable create(CategoryTable c);
    CategoryTable update(CategoryTable c);
    void delete(int id);

}
