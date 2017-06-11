package com.ccsdt.cycle;

/**
 * Created by HP on 2017/6/10.
 */
public class Car {
    private String brand;

    public Car() {
        System.out.println("Constructor...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Set brand......");
        this.brand = brand;
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
                '}';
    }
}
