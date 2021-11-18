package com.geekbrains.spring.web.controllers;


import com.geekbrains.spring.web.repositories.ProductsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

private ProductsRepository productsRepository;

    public MainController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/show_products")
    public String showProducts(Model model) {
        model.addAttribute("products", productsRepository.getProducts());
        return "products_page";
    }
}
