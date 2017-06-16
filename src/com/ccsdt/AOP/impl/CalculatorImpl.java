package com.ccsdt.AOP.impl;

import org.springframework.stereotype.Component;

/**
 * Created by HP on 2017/6/15.
 */

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
