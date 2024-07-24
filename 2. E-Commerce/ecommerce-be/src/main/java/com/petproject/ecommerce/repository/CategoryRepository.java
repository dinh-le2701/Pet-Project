package com.petproject.ecommerce.repository;

import com.petproject.ecommerce.model.Category;
import com.petproject.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
