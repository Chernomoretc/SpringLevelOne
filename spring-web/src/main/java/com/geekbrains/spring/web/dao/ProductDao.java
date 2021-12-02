package com.geekbrains.spring.web.dao;

import com.geekbrains.spring.web.SessionFactoryUtils;
import com.geekbrains.spring.web.data.Product;
import org.hibernate.Session;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ProductDao {
    private static SessionFactoryUtils sessionFactoryUtils;

    public ProductDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

//    public static List<Product> getProducts() {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            List<Product> products = session.createQuery("select p from product p").getResultList();
//            session.getTransaction().commit();
//            return products;
//        }
//    }
//
//    public static Product findById(Long id) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            Product product = session.get(Product.class, id);
//            session.getTransaction().commit();
//            return product;
//        }
//    }
//
//    public static void deleteProduct(Long id) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            session.createQuery("delete from product p where id = :id")
//                    .setParameter("id", id)
//                    .executeUpdate();
//            session.getTransaction().commit();
//        }
//    }
//
//    public static void changeCostProduct(Long id, Integer delta) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            Product p = session.get(Product.class, id);
//            p.setCost(p.getCost() + delta);
//            session.update(p);
//            session.getTransaction().commit();
//        }
//    }
}