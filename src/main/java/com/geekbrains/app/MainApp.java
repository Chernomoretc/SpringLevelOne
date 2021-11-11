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
            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                String[] command = line.split(" ");
                switch (command[0]) {
                    case ("showProducts"): {
                        userCart.showProducts();
                        break;
                    }
                    case ("showCart"): {
                        userCart.showCart();
                        break;
                    }
                    case ("add"): {
                        System.out.println(userCart.addCart(Long.parseLong(command[1])));
                        break;
                    }
                    case ("delete"): {
                        System.out.println(userCart.deleteCart(Long.parseLong(command[1])));
                        break;
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
