package com.geekbrains.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainApp {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart userCart = context.getBean(Cart.class);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String command;
            while (!(command = reader.readLine()).equals("exit")) {
                switch (command) {
                    case ("showProducts"): {
                        userCart.showProducts();
                        break;
                    }
                    case ("showCart"): {
                        userCart.showCart();
                        break;
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
