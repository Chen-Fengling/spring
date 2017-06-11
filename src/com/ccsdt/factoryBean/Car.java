package com.ccsdt.factoryBean;

/**
 * Created by HP on 2017/6/10.
 */
public class Car {
    private String brand;
    private double price;

    public Car() {
        System.out.println("Constructor...");
    }

    public Car(String brand, double price) {
        System.out.println("Constructor with two parameters：brand "+brand+",price "+price);
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Set brand......");
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void init(){
        System.out.println("init.....");
    }

    public void destroy(){
        System.out.println("destroy.....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
