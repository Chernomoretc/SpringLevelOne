package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.entities.Product;
import com.geekbrains.spring.web.exceptions.ResourceNotFoundException;
import com.geekbrains.spring.web.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findALL() {
        return productRepository.findAll();
    }


    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Transactional
    public void changeCost(Long productId, Integer delta) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Unable to change product's cost. Product not found, id: " + productId));
        product.setCost(product.getCost() + delta);
    }

    public List<Product> findAllByCostMin(Long min) {
        return productRepository.findAllByCostMin(min);

    }

    public List<Product> findAllByCostMax(Long max) {
        return productRepository.findAllByCostMax(max);
    }

    public List<Product> findAllByCostMinMax(Long min, Long max) {
        return productRepository.findAllByCostMinMax(min, max);
    }
}
