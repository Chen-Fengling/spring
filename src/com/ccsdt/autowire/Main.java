package com.ccsdt.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\MyWork\\SMVC\\spring\\resources\\Autowire.xml");

        Person person = (Person)ctx.getBean("person");
        System.out.println(person);

        Person person2 = (Person)ctx.getBean("person2");
        System.out.println(person2);
    }
}
