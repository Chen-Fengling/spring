package com.ccsdt.AOP.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 2017/6/15.
 */

public class LoggingAspect {
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List arg = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName+" starts with "+arg);
    }

    public void afterRunningMethod(JoinPoint joinPoint,Object returnValue){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+" finished with "+returnValue);
    }

    public void AfterThrowing(Exception e){
        System.out.println("The method occurred with Exception: "+e);
    }

    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+" ends! ");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        String methodName = proceedingJoinPoint.getSignature().getName();
        List arg = Arrays.asList(proceedingJoinPoint.getArgs());
        Object result = 0;

        try {
            //前置通知
            //......
           result=proceedingJoinPoint.proceed();
            //返回通知
            //......
        } catch (Throwable throwable) {
            //异常通知
            //......
            throwable.printStackTrace();
            throw new RuntimeException(throwable);
        }
        //后置通知
        //......
        return result;
    }
}
