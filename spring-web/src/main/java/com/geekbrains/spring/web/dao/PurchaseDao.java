package com.geekbrains.spring.web.dao;

import com.geekbrains.spring.web.data.Purchase;
import com.geekbrains.spring.web.repositories.SessionFactoryUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public class PurchaseDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public PurchaseDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public Purchase findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Purchase purchase = session.get(Purchase.class, id);
            session.getTransaction().commit();
            return purchase;
        }
    }

    public List<Purchase> findAll() {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Purchase> purchases = (List<Purchase>)session.createQuery("from purchases", List.class);
            session.getTransaction().commit();
            return purchases;
        }
    }

//    public Product saveOrUpdate(Product product) {
//        try (Session session = sessionFactory.getCurrentSession()) {
//            session.beginTransaction();
//            session.saveOrUpdate(product);
//            session.getTransaction().commit();
//            return product;
//        }
//    }
//
//    public void delete(Long id) {
//        try (Session session = sessionFactory.getCurrentSession()) {
//            session.beginTransaction();
//            session.createQuery("delete from Product p where p.id = :id")
//                    .setParameter("id", id)
//                    .executeUpdate();
//            session.getTransaction().commit();
//        }
//    }
//
//    public void delete(Product product) {
//        try (Session session = sessionFactory.getCurrentSession()) {
//            session.beginTransaction();
//            session.delete(product);
//            session.getTransaction().commit();
//        }
//    }


}
