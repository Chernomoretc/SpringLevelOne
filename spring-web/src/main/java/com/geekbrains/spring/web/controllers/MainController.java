package com.geekbrains.spring.web.controllers;


import com.geekbrains.spring.web.dto.ProductDto;
import com.geekbrains.spring.web.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/products")

public class MainController {
    private ProductService productService;

    public MainController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<ProductDto> getAllProducts(
            @RequestParam(name = "min_cost", required = false) Long minCost,
            @RequestParam(name = "max_cost", required = false) Long maxCost,
            @RequestParam(name = "p", defaultValue = "1") Integer page
    ) {
        if (page<1)page=1;
        return productService.findALL(minCost,maxCost,page).map(
                p -> new ProductDto(p));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @PutMapping
    public void changeCost(@RequestParam Long productId, @RequestParam Long delta) {
        productService.changeCost(productId, delta);
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto productDto)
    {
        productDto.setId(null);
        productService.addProduct(productDto);
    }
}
