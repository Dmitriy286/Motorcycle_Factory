package com.company.YamahaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ICrossBike;

public class YamahaCrossBike implements ICrossBike {
    @Override
    public Bike createCrossBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Yamaha");
        bike.setType("Кроссовый");
        bike.setSpeed(90);
        return bike;
    }
}
