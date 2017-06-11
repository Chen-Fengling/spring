package com.ccsdt.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by HP on 2017/6/10.
 */
public class CarFactoryBean implements FactoryBean{
    private String brand;

    /**
     * 自定义的FactoryBean需要实现FactoryBean中的三个方法
     */
    @Override
    public Object getObject() throws Exception {
        return new Car(brand,50000.002);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
