package com.ccsdt.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2017/6/10.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycles.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        ctx.close();

    }
}
