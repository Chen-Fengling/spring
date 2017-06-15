package com.ccsdt.AOP_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 2017/6/15.
 */
public class CalculatorLoggingProxy {
    private Calculator target;

    public CalculatorLoggingProxy(Calculator target) {
        this.target = target;
    }

    public Calculator getLoggingProxy(){
        Calculator proxy = null;

        //代理对象由哪一个类加载器负责
        ClassLoader classLoader = target.getClass().getClassLoader();
        //代理对象类型，即包含哪些方法
        Class[] interfaces = new Class[]{Calculator.class};
        //当调用代理对象其中的方法时，需要执行的代码
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             * @param proxy 正在使用的代理对象，，一般情况下invoke方法中不使用该对象
             * @param method 正在被调用的方法
             * @param args 调用方法是传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                //开始前日志
                System.out.println(methodName+" method starts with "+ Arrays.asList(args));
                //验证参数
                for (Object i:args){
                    if ((int)i<0){
                        System.out.println("All params should not be less than zero;");
                        return -1;
                    }
                }
                //验证参数日志
                //执行方法并返回结果
                Object result = method.invoke(target,args);
                //结束后日志
                System.out.println(methodName+" finishes starts with result:"+result);
                return result;
            }
        };
        return proxy = (Calculator) Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);

    }

}
