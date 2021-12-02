package com.geekbrains.spring.web.dao;

import com.geekbrains.spring.web.SessionFactoryUtils;
import com.geekbrains.spring.web.data.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDao {
    private static SessionFactoryUtils sessionFactoryUtils;

    public CustomerDao(SessionFactoryUtils sessionFactoryUtils) {

        this.sessionFactoryUtils = sessionFactoryUtils;
    }


//    public static Customer findById(Long id) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            Customer customer = session.get(Customer.class, id);
//            session.getTransaction().commit();
//            return customer;
//        }
//    }
//
//    public static List<Customer> findAll() {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            List<Customer> customerList = (List<Customer>)session.createQuery("from customer", List.class);
//            session.getTransaction().commit();
//            return customerList;
//        }
//    }
//
//    public static Customer saveOrUpdate(Customer customer) {
//        try (Session session = sessionFactoryUtils.getSession()) {
//            session.beginTransaction();
//            session.saveOrUpdate(customer);
//            session.getTransaction().commit();
//            return customer;
//        }
//    }
//
//    public static void delete(Long id) {
//            try (Session session = sessionFactoryUtils.getSession()) {
//                session.beginTransaction();
//                session.createQuery("delete from customer c where id = :id")
//                        .setParameter("id", id)
//                        .executeUpdate();
//                session.getTransaction().commit();
//            }
//        }
}
