package com.ccsdt.annotation;

import com.ccsdt.annotation.component.UserComponent;
import com.ccsdt.annotation.controller.UserController;
import com.ccsdt.annotation.repository.UserRepository;
import com.ccsdt.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2017/6/11.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
//        UserComponent userComponent = (UserComponent) ctx.getBean("userComponent");
//        System.out.println(userComponent);
//
        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);
        userController.test();
//
//        UserRepository userRepository = (UserRepository) ctx.getBean("userRepositoryImpl");
//        System.out.println(userRepository);
//
//        UserService userService = (UserService) ctx.getBean("userService");
//        System.out.println(userService);

    }
}
