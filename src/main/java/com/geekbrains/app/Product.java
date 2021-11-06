package com.geekbrains.app;

public class Product {
    private int id;
    private String title;
    private int coast;

    public Product(int id, String title, int coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "id=" + id +
                " title=" + title +
                " coast=" + coast + "rub" ;
    }
}
