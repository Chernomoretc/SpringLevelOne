package com.geekbrains.spring.web.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "customer")
@Table(name = "customers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long id;

    @Column(name = "name")
    private String name;

//    @OneToMany
//    @JoinColumn(name = "purchases")
//    private List<Purchase> purchases;

    public Customer() {
    }

    public List<Purchase> getPurchases() {
        List<Purchase> purchases = new ArrayList<>();
        return purchases;
    }

//    public void setPurchases(List<Purchase> purchases) {
//        this.purchases = purchases;
//    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer [id = %d, name = %s]", id, name);

    }
}
