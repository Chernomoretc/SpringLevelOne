package com.geekbrains.spring.web.controllers;

import com.geekbrains.spring.web.carts.Cart;
import com.geekbrains.spring.web.dto.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cart")
public class CartsController {
    private Cart cart;

    public CartsController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping
    public List<ProductDto> getCart()
    {
        System.out.println(cart.getProductsInCart());
        return cart.getProductsInCart();
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto productDto)
    {
        System.out.println(productDto.toString());
        cart.addCart(productDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id)
    {
        cart.delete(id);
    }
}
