package com.geekbrains.app;

public class Product {
    private Long id;
    private String title;
    private int coast;

    public Product(Long id, String title, int coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return "id=" + id +
                " title=" + title +
                " coast=" + coast + "rub" ;
    }
}
