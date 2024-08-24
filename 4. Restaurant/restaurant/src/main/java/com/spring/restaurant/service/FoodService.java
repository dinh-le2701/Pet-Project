package com.spring.restaurant.service;

import com.spring.restaurant.model.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodService {
    List<Food> getFoods();

    Food getFoodById(Long id);

    Food saveFood(Food food);

    Food updateFood(Long id, Food updateFood);

    void deleteFood(Long id);
}
