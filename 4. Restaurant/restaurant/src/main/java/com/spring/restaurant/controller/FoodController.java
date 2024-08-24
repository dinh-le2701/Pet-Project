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
        try {
            List<Food> foods = foodService.getFoods();
            log.info("Get all food completed!");
            return new ResponseEntity<>(foods, HttpStatus.FOUND);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") Long id){
        try {
            Food food = foodService.getFoodById(id);
            log.info(food + "has found!");
            return new ResponseEntity<>(food, HttpStatus.FOUND);
        } catch (Exception e){
            log.warn("Not found food has id: " + id + e);
            throw new RuntimeException(e);
        }
    }

    @PostMapping("")
    public ResponseEntity<Food> saveFood(@RequestBody Food food){
        try {
            log.info(food + "is saved!");
            foodService.saveFood(food);
            return new ResponseEntity<>(food, HttpStatus.CREATED);
        } catch (Exception e){
            log.warn("Saved food has error: " + e);
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable("id") Long id,@RequestBody Food updateFood){
        try {
            Food food = foodService.updateFood(id, updateFood);
            log.info(food + "has update!");
            return new ResponseEntity<>(food, HttpStatus.FOUND);
        } catch (Exception e){
            log.warn("Not found food has id: " + id + e);
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable("id") Long id){
        try {
            foodService.deleteFood(id);
            log.info("Food deleted with id: " + id);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
