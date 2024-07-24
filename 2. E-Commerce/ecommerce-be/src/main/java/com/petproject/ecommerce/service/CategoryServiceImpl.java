package com.petproject.ecommerce.service;

import com.petproject.ecommerce.model.Category;
import com.petproject.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createNewCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category editCategory(Integer category_id, Category category) {
        return null;
    }
}

