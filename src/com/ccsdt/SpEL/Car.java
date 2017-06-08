package com.ccsdt.SpEL;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Car {
    private String brand;
    private double price;
    private double zhouChang;

    public Car() {
    }

    public Car(String brand, double price, double zhouChang) {
        this.brand = brand;
        this.price = price;
        this.zhouChang = zhouChang;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getZhouChang() {
        return zhouChang;
    }

    public void setZhouChang(double zhouChang) {
        this.zhouChang = zhouChang;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", zhouChang=" + zhouChang +
                '}';
    }
}
