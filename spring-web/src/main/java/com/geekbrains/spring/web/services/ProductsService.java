package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.data.Product;
import com.geekbrains.spring.web.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductRepository productRepository;

    public ProductsService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }

    public void changeCost(Long id, Integer delta) {
        System.out.println(delta);
        productRepository.changeCostProduct(id, delta);
    }

    public void deleteById(Long id) {
        productRepository.deleteProduct(id);
    }
}
