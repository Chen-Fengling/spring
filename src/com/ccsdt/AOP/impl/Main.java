package com.ccsdt.AOP.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2017/6/15.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/Spring-AOP.xml");
        Calculator calculator = ctx.getBean(Calculator.class);

        int result=calculator.div(4,2);
        System.out.println(result);
    }
}
