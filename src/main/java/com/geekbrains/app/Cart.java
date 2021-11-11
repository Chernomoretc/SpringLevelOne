package com.geekbrains.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    @Autowired
    private ProductRepository productRepository;
    List<Long> productsInCart = new ArrayList<>();

    public String addCart(Long id) {
        if (productRepository.findById(id) != null) {
            productsInCart.add(id);
            return "add ok";
        } else {
            return "No such id exists";
        }
    }

    public String deleteCart(Long id) {
        if (productsInCart.contains(id)) {
            productsInCart.remove(id);
            return "delete ok";
        } else {
            return "No such id exists or is not in the cart";
        }
    }

    public void showProducts() {
        productRepository.getProducts().forEach(p -> System.out.println(p.toString()));
    }

    public void showCart() {
        if (productsInCart.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            productsInCart.forEach(id -> {
                System.out.println(productRepository.findById(id).toString());
            });
        }
    }

}
