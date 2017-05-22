package com.ccsdt;

/**
 * Created by chenrun on 2017/5/22.
 */
public class Car {
    private String banch;
    private String corp;
    private double price;
    private int amount;

    public Car(String banch, String corp, double price) {
        this.banch = banch;
        this.corp = corp;
        this.price = price;
    }

    public Car(String banch, String corp, int amount) {
        this.banch = banch;
        this.corp = corp;
        this.amount = amount;
    }

    public Car() {
    }

    public String getBanch() {
        return banch;
    }

    public void setBanch(String banch) {
        this.banch = banch;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "banch='" + banch + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
