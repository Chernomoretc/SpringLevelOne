package com.geekbrains.spring.web.dto;
import com.geekbrains.spring.web.entities.Product;


public class ProductDto {
    private Long id;
    private String title;

    public ProductDto() {
    }

    private Long cost;

    public ProductDto(Product p) {
        this.id = p.getId();
        this.title = p.getTitle();
        this.cost = p.getCost();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Long getCost() {
        return cost;
    }


    @Override
    public String toString() {
        return "id = " + id +
                " title = " + title +
                " cost = " + cost + "rub";
    }

}
