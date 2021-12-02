package com.geekbrains.spring.web.data;

import javax.persistence.*;
import java.util.List;


@Entity(name = "purchase")
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "products")
    private String products;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }
//    @OneToMany(mappedBy = "products")
//    private List<Product> products;


    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", products='" + products + '\'' +
                ", customer=" + customer.getId() +
                '}';
    }
}
