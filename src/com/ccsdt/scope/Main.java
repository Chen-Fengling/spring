package com.ccsdt.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
        Address address = (Address)ctx.getBean("address");
        Address address2 = (Address)ctx.getBean("address");
        System.out.println(address==address2);

    }
}
