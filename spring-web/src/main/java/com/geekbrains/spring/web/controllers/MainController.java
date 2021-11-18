package com.geekbrains.spring.web.controllers;


import com.geekbrains.spring.web.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

private ProductRepository productRepository;

    public MainController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/show_products")
    public String showProducts(Model model) {
        model.addAttribute("products",productRepository.getProducts());
        return "products_page";
    }
}
