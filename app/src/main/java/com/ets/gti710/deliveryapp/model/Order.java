package com.ets.gti710.deliveryapp.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Anjay on 2016-10-28.
 */

public class Order {
    private final int id;
    private final List<OrderLine> ordersLines;
    private final Customer customer;
    private final Date date;

    public Order(int id, List<OrderLine> ordersLines, Customer customer, Date date) {
        this.id = id;
        this.ordersLines = ordersLines;
        this.customer = customer;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderLine> getOrdersLines() {
        return ordersLines;
    }
}
