package com.ets.gti710.deliveryapp.model;

/**
 * Created by Anjay on 2016-10-28.
 */

public class Customer {
    private final int id;
    private final String name;
    private final String street;
    private final String street2;
    private final String city;
    private final String zip;
    private final String state_name;
    private final String country_name;
    private final String email;
    private final String phone;

    public Customer(int id, String phone, String email, String country_name, String state_name,
                    String zip, String city, String street2, String street, String name) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.country_name = country_name;
        this.state_name = state_name;
        this.zip = zip;
        this.city = city;
        this.street2 = street2;
        this.street = street;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getState_name() {
        return state_name;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getStreet2() {
        return street2;
    }

    public String getStreet() {
        return street;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
