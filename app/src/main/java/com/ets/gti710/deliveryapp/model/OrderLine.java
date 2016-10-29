package com.ets.gti710.deliveryapp.model;

/**
 * Created by Anjay on 2016-10-28.
 */

public class OrderLine {

    private final int id;
    private final Product product;
    private final int quantity;

    public OrderLine(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
