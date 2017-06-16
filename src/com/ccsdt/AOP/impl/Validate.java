package com.ccsdt.AOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * Created by chenrun on 2017/6/16.
 */

//@Order(5)必须注释在类上
@Order(5)
@Aspect
@Component
public class Validate {

    @Before(value = "com.ccsdt.AOP.impl.LoggingAspect.pointCutExpression()")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("---> Validate");
    }

}
