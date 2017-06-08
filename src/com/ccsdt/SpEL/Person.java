package com.ccsdt.SpEL;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Person {
    private Address address;
    private Car car;
    private String city;

    //Car.price 大于30k为金领否则为白领
    private String info;

    public Person() {
    }

    public Person(Address address, Car car, String city, String info) {
        this.address = address;
        this.car = car;
        this.city = city;
        this.info = info;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
