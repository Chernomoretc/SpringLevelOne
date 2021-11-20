package com.geekbrains.spring.web.data;

public class Product {
    private Long id;
    private String title;
    private Integer cost;

    public Product(Long id, String title, Integer cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "id=" + id +
                " title=" + title +
                " cost=" + cost + "rub";
    }


    public void changeCostProduct(Integer delta) {
        cost = cost + delta;
    }
}
