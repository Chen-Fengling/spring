package com.ccsdt.SpEL;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Address {
    private String stree;
    private String city;

    public Address() {
    }

    public Address(String stree, String city) {
        this.stree = stree;
        this.city = city;
    }

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "stree='" + stree + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
