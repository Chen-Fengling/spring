package com.ccsdt.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP on 2017/6/10.
 */
public class InstanceFactory {
    private Map<String,Car> cars = new HashMap<String,Car>();

    public InstanceFactory() {
        cars.put("Audi",new Car("Audi",50000.01));
        cars.put("BMW",new Car("BMW",60000.25));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }
}
