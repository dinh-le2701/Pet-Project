package com.petproject.ecommerce.service;

import com.petproject.ecommerce.model.Product;
import com.petproject.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImple implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer product_id) {
        return productRepository.findById(product_id)
                .orElseThrow(() -> new RuntimeException("Not found task had id: " + product_id));
    }

    @Override
    public Product createNewProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProductById(Integer product_id, Product product) {
        return null;
    }

    @Override
    public void deleteProductById(Integer product_id) {
        productRepository.deleteById(product_id);
    }
}
