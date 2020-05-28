package com.trainingcenter.api;

public class Product {
    private long id;
    private String name;
    private String description;
    private String preco;

    public Product() { }

    public Product(long id, String name, String description, String preco) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.preco = preco;
    }

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPreco() { return preco; }
}
