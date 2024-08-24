package com.spring.restaurant.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "food_name")
    @NotNull
    @Size(max=64)
    private String food_name;

    @Column(name = "img")
    private String img;

    @Column(name = "price")
    @Min(35000)
    private double price;
}
