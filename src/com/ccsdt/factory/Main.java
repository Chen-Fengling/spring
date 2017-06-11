package com.ccsdt.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2017/6/10.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
        System.out.println(ctx.getBean("car1"));
        System.out.println(ctx.getBean("car2"));
    }
}
