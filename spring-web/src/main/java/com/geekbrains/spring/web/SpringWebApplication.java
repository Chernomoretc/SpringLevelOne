package com.geekbrains.spring.web;


import com.geekbrains.spring.web.dao.PurchaseDao;
import com.geekbrains.spring.web.data.Purchase;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;
import java.lang.annotation.Annotation;
import java.util.List;


//@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SpringWebApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.geekbrains.spring.web");
        PurchaseDao purchaseDao = context.getBean(PurchaseDao.class);
        //Поиск покупок по id покупателя
        List<Purchase> purchases = purchaseDao.findByCustomerId(2l);
        purchases.forEach(purchase -> System.out.println(purchase.toString()));
    }
//http://localhost:8189/app/index.html
}
