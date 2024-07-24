package com.petproject.ecommerce.service;

import com.petproject.ecommerce.model.Category;
import com.petproject.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> getAllCategories();

    Category createNewCategory(Category category);

    Category editCategory(Integer category_id, Category category);


}
