package com.ccsdt.collection;

import com.ccsdt.Car;

import java.util.List;

/**
 * Created by chenrun on 2017/5/23.
 */
public class Teacher {
    private String name;
    private int age;
    private List<Car> cars;

    public Teacher() {
    }

    public Teacher(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
