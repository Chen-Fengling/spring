package com.ccsdt.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenrun on 2017/6/13.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-repository.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }

}
