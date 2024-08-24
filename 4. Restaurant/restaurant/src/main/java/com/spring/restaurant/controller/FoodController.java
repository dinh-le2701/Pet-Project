package com.spring.restaurant.controller;

import com.spring.restaurant.model.Food;
import com.spring.restaurant.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {
    private static Logger log = LoggerFactory.getLogger(FoodController.class);

    @Autowired
    private FoodService foodService;

    @GetMapping("")
    public ResponseEntity<List<Food>> getFoods(){
        List<Food> foods = foodService.getFoods();
        log.info("Get all food completed!");
        return new ResponseEntity<>(foods, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") Long id){
        Food food = foodService.getFoodById(id);
        log.info(food + "has found!");
        return new ResponseEntity<>(food, HttpStatus.FOUND);
    }

    @PostMapping("")
    public ResponseEntity<Food> saveFood(@RequestBody Food food){
        log.info(food + "is saved!");
        foodService.saveFood(food);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable("id") Long id, Food updateFood){
        Food food = foodService.getFoodById(id);
        log.info(food + "has update!");
        return new ResponseEntity<>(food, HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable("id") Long id){
        log.info("Food deleted with id: " + id);
    }
}
