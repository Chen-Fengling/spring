package com.ccsdt.factory;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP on 2017/6/10.
 */
public class StaticFactory {
    private static Map<String,Car>cars = new HashMap<String,Car>();

    static {
        cars.put("Audi",new Car("Audi",300000));
        cars.put("BMW",new Car("BMW",400000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
