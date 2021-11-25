package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.SessionFactoryUtils;
import com.geekbrains.spring.web.data.Product;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductRepository {
//    private List<Product> products;
//    @PostConstruct
//    public void init() {
//        products = new ArrayList<>();
//        products.add(new Product(1L, "apple", 10));
//        products.add(new Product(2L, "potato", 5));
//        products.add(new Product(3L, "banana", 7));
//        products.add(new Product(4L, "milk", 12));
//        products.add(new Product(5L, "bread", 15));
//    }
    private SessionFactoryUtils sessionFactoryUtils;
    public ProductRepository (SessionFactoryUtils sessionFactoryUtils)
    {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public List<Product> getProducts() {

        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Product> products = session.createQuery("select p from products p").getResultList();
            session.getTransaction().commit();
            return products;
        }
    }

    public Product findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            session.getTransaction().commit();
            return product;
        }

    }

    public void deleteProduct(Long id) {

       // products.removeIf(p -> p.getId().equals(id));
    }
}