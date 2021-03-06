package com.ccsdt.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-SpEL.xml");
        Address address = (Address) ctx.getBean("address");
        System.out.println(address);
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

    }
}
