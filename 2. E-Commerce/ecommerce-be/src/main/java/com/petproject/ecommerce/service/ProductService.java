package com.petproject.ecommerce.service;

import com.petproject.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProduct();

    Product getProductById(Integer product_id);

    Product createNewProduct(Product product);

    Product updateProductById(Integer product_id, Product product);

    void deleteProductById(Integer product_id);
}
