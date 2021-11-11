package com.geekbrains.app;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;


@Component
public class ProductRepository {
    private ArrayList<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();

        products.add(new Product(1L, "apple", 10));
        products.add(new Product(2L, "potato", 5));
        products.add(new Product(3L, "banana", 7));
        products.add(new Product(4L, "milk", 12));
        products.add(new Product(5L, "bred", 15));
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException());
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
