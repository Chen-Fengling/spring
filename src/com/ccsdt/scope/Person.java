package com.ccsdt.scope;

import com.ccsdt.autowire.Car;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Person {
    private Address address;
    private Car car;

    public Person() {
    }

    public Person(Address address, Car car) {
        this.address = address;
        this.car = car;
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

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", car=" + car +
                '}';
    }
}
