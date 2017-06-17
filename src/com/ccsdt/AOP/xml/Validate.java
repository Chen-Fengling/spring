package com.ccsdt.AOP.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * Created by chenrun on 2017/6/16.
 */

public class Validate {

    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("---> Validate");
    }

}
