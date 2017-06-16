package com.ccsdt.AOP.impl;

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

//把类声明为一个切面：1、先将类声明到IOC容器中，2、将该类声明为切面
@Aspect
@Component
public class LoggingAspect {

    //声明一个方法，用于声明切入点表达式，一般该方法中不需要其他代码
    //使用@Pointcut来声明切入点表达式
    //其他通知引用方式：@Before(value = "pointCutExpression()") 或 @Before(value = "com.ccsdt.AOP.impl.LoggingAspect.pointCutExpression()")
    @Pointcut(value = "execution(* com.ccsdt.AOP.impl.CalculatorImpl.*(..))")
    public void pointCutExpression(){}

    //声明该方法是一个前置通知：在目标方法执行之前执行
    @Order(9)
    @Before(value = "pointCutExpression()")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List arg = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName+" starts with "+arg);
    }

    //返回通知，目标方法执行后执行，可以访问到目标的返回值
    //但当目标方法发生异常后无法获取到返回值
    @AfterReturning(value = "pointCutExpression()",returning = "returnValue")
    public void afterRunningMethod(JoinPoint joinPoint,Object returnValue){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+" finished with "+returnValue);
    }

    //在目标方法发生异常后执行，可以获取到目标的异常
    //可以在发生特定的异常时再执行异常通知
    @AfterThrowing(value = "pointCutExpression()",throwing = "e")
    public void AfterThrowing(Exception e){
        System.out.println("The method occurred with Exception: "+e);
    }

    //后置通知：在目标方法执行之后（无论是否发生异常），执行通知
    //后置通知中无法访问目标方法的执行结果
    @After(value = "pointCutExpression()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName+" ends! ");
    }

    //环绕通知，功能十分强大，但并不是最常用的
    @Around(value = "pointCutExpression()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        String methodName = proceedingJoinPoint.getSignature().getName();
        List arg = Arrays.asList(proceedingJoinPoint.getArgs());
        Object result = null;

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
