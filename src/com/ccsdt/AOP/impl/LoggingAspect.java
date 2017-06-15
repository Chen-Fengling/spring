package com.ccsdt.AOP.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 2017/6/15.
 */

//把类声明为一个切面：1、先将类声明到IOC容器中，2、将该类声明为切面
@Aspect
@Component
public class LoggingAspect {
    //声明该方法是一个前置通知：在目标方法执行之前执行
    @Before(value = "execution(public int com.ccsdt.AOP.impl.CalculatorImpl.add(int,int ))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List arg = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName+" starts with "+arg);
    }
    @AfterReturning(value = "execution(public int com.ccsdt.AOP.impl.CalculatorImpl.add(int,int ))",returning = "returnValue")
    public void afterRunningMethod(JoinPoint joinPoint,Object returnValue){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+" finished with "+returnValue);
    }

    //后置通知：在目标方法执行之后（无论是否发生异常），执行通知
    //后置通知中无法访问目标方法的执行结果
    @After(value = "execution(public int com.ccsdt.AOP.impl.CalculatorImpl.add(int,int ))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+" ends! ");
    }
}
