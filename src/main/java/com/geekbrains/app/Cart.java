package com.geekbrains.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope
public class Cart {
    @Autowired
    private ProductRepository productRepository;
    List<Long> productsInCart = new ArrayList<>();

    public void addCart(Long id) {
        if (productRepository.findById(id) != null) {
            productsInCart.add(id);
        } else {
            System.out.println("No such id exists");
        }
    }

    public void deleteCart(Long id) {
        if (productsInCart.contains(id)) {
            productsInCart.remove(id);
        } else {
            System.out.println("No such id exists or is not in the cart");
        }
    }

    public void showProducts() {
        productRepository.getProducts().forEach(p -> System.out.println(p.toString()));
    }

    public void showCart() {
        if (productsInCart.isEmpty()) {
            System.out.println("Cart is empty");
        }
    }

}
