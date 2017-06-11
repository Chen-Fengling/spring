package com.ccsdt.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2017/6/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-FactoryBean.xml");
        Car car = (Car) ctx.getBean("factoryBean");
        System.out.println(car);
    }
}
