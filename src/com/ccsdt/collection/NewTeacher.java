package com.ccsdt.collection;

import com.ccsdt.Car;

import java.util.List;
import java.util.Map;

/**
 * Created by chenrun on 2017/5/23.
 */
public class NewTeacher {
    private String name;
    private int age;
    private Map<String,Car> cars;

    public NewTeacher() {
    }

    public NewTeacher(String name, int age, Map<String, Car> cars) {
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

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "NewTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
