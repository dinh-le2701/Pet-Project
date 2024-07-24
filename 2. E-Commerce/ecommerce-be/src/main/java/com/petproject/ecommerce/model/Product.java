package com.petproject.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int product_id;

    @Column(name = "product_name", nullable = false)
    private String product_name;

    @Column(name = "images")
    private String images;

    @Column(name = "price")
    private double price;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Category category;

}
