package com.geekbrains.spring.web;


import com.geekbrains.spring.web.dao.PurchaseDao;
import com.geekbrains.spring.web.data.Purchase;
import com.geekbrains.spring.web.repositories.SessionFactoryUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SpringWebApplication.class, args);
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            PurchaseDao dao = new PurchaseDao(sessionFactoryUtils);
            Purchase p = dao.findById(1l);
            System.out.println(p.toString());
        } catch (Exception e) {
            e.printStackTrace();
//        } finally {
//            sessionFactoryUtils.shutdown();
        }

    }
//http://localhost:8189/app/index.html
}
