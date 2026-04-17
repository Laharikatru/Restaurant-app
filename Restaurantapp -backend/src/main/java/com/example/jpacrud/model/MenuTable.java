package com.example.jpacrud.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Menu_Table")
public class MenuTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String itemName;

    private double price;

    @Column(name = "image_url")
    private String imageUrl;

    // 🔥 break recursion
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private CategoryTable category;

    // getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public CategoryTable getCategory() {
        return category;
    }

    public void setCategory(CategoryTable category) {
        this.category = category;
    }
}