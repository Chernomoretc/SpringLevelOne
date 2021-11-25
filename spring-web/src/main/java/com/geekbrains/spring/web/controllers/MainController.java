package com.geekbrains.spring.web.controllers;


import com.geekbrains.spring.web.data.Product;
import com.geekbrains.spring.web.services.ProductsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class MainController {

    private ProductsService productsService;

    public MainController(ProductsService productsService) {
        this.productsService = productsService;
    }


    @GetMapping("/products")
    public List<Product> showProducts(Model model) {
        return productsService.getAllProducts();
    }

    @GetMapping("/products/delete")
    public void deleteById(@RequestParam Long productId) {
        productsService.deleteById(productId);
    }

    @GetMapping("/products/change_cost")
    public void changeCost(@RequestParam Long productId,@RequestParam Integer delta) {
        productsService.changeCost(productId, delta);

    }

}
