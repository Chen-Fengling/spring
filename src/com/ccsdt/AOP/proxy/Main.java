package com.ccsdt.AOP.proxy;

/**
 * Created by HP on 2017/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Calculator target = new CalculatorImpl();
        CalculatorLoggingProxy proxy = new CalculatorLoggingProxy(target);

        proxy.getLoggingProxy().add(4,5);
    }
}
