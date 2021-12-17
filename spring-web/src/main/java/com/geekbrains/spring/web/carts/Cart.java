package com.geekbrains.spring.web.carts;

import com.geekbrains.spring.web.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class Cart {
    public Cart() {
    }

    private List<ProductDto> productsInCart = new ArrayList<>();

    public List<ProductDto> getProductsInCart() {
        return Collections.unmodifiableList(productsInCart);
    }

    public List<ProductDto> addCart(ProductDto productDto) {
        productsInCart.add(productDto);
        return productsInCart;
    }

    public void delete(Long id) {
     productsInCart.removeIf(p->p.getId().equals(id));
    }


}
