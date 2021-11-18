package com.geekbrains.spring.web.data;

public class Product {
    private Long id;
    private String title;
    private int cost;

    public Product(Long id, String title, int cost) {
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

    public int getCoast() {
        return cost;
    }

    @Override
    public String toString() {
        return "id=" + id +
                " title=" + title +
                " cost=" + cost + "rub" ;
    }
}
