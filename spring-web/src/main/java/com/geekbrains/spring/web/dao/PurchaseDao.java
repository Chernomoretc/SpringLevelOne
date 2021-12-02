package com.geekbrains.spring.web.dao;

import com.geekbrains.spring.web.data.Purchase;
import com.geekbrains.spring.web.SessionFactoryUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PurchaseDao {
    private static SessionFactoryUtils sessionFactoryUtils;

    public PurchaseDao(SessionFactoryUtils sessionFactoryUtils) {

        this.sessionFactoryUtils = sessionFactoryUtils;
    }

//    public static Purchase findById(Long id) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            Purchase purchase = session.get(Purchase.class, id);
//            session.getTransaction().commit();
//            return purchase;
//        }
//    }
//    public static List<Purchase> findByCustomerId(long id) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            List<Purchase> purchases = session
//                    .createQuery("select p from purchase p where customer_id = :id ")
//                    .setParameter("id", id)
//                    .getResultList();
//            session.getTransaction().commit();
//            return purchases;
//        }
//    }
//
//    public static List<Purchase> findAll() {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            List<Purchase> purchaseList = session.createQuery("select p from purchase p").getResultList();
//            session.getTransaction().commit();
//            return purchaseList;
//        }
//    }

    public static void delete(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            session.createQuery("delete from purchase p where id = :id")
                    .setParameter("id", id)
                    .executeUpdate();
            session.getTransaction().commit();
        }
    }


}
