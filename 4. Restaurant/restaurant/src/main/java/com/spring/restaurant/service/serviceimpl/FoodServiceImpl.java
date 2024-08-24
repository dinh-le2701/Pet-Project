package com.spring.restaurant.service.serviceimpl;

import com.spring.restaurant.model.Food;
import com.spring.restaurant.repository.FoodRepository;
import com.spring.restaurant.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> getFoods() {
        return foodRepository.findAll();
    }

    @Override
    public Food getFoodById(Long id) {
        return foodRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Not found food has id: " + id));
    }

    @Override
    public Food saveFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food updateFood(Long id, Food updateFood) {
        Food food = foodRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Not found food has id: " + id));
        food.setFood_name(updateFood.getFood_name());
        food.setImg(updateFood.getImg());
        food.setPrice(updateFood.getPrice());

        return foodRepository.save(food);
    }

    @Override
    public void deleteFood(Long id) {
        Food food = foodRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Not found food has id: " + id));
        foodRepository.deleteById(id);
    }
}
