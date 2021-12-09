package com.geekbrains.spring.web.controllers;



import com.geekbrains.spring.web.entities.Product;

import com.geekbrains.spring.web.services.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class MainController {
private ProductService productService;

    public MainController(ProductService productService) {
         this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> showProducts(Model model) {
        return productService.findALL();
    }

    @GetMapping("/products/delete")
    public void deleteById(@RequestParam Long productId) {
        productService.deleteById(productId);
    }

    @GetMapping("/products/change_cost")
    public void changeCost(@RequestParam Long productId,@RequestParam Integer delta) {

        productService.changeCost(productId, delta);
    }

    @GetMapping("/products/filter")
    public List<Product> filterMinMax(@RequestParam (defaultValue = "0") Long min,@RequestParam (defaultValue = "100") Long max)
    {
        return productService.findAllByCostMinMax(min,max);
    }


}
