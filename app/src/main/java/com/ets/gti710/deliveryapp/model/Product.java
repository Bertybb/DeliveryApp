package com.ets.gti710.deliveryapp.model;

/**
 * Created by Anjay on 2016-10-28.
 */

public class Product {

    private final long id;
    private final String code;
    private final String name;
    private final String category;
    private final String description;

    public Product(long id, String description, String category, String name, String code) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.name = name;
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
