package com.geekbrains.spring.web.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "product")
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private Long cost;

//    @OneToMany(mappedBy = "product")
//    private List<Purchase> purchases;

    public Product() {
    }


    public Product(Long id, String title, Long cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
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
