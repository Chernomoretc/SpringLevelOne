package com.geekbrains.app;

import javax.servlet.*;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        List <Product> products = new ArrayList<>();
        products.add(new Product(1,"apple",10));;
        products.add(new Product(2,"potato",5));;
        products.add(new Product(3,"banana",7));;
        products.add(new Product(4,"juice",12));;
        products.add(new Product(5,"bred",15));;
        products.add(new Product(6,"oil",14));;
        products.add(new Product(7,"salt",7));;
        products.add(new Product(8,"sugar",9));;
        products.add(new Product(9,"meat",20));;
        products.add(new Product(10,"fish",25));;
        resp.getWriter().printf("<html><body>");
        for (Product p :products) {
            resp.getWriter().printf("<h1>product " + p.toString() + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }



    @Override
    public void init() throws ServletException {

    }
}