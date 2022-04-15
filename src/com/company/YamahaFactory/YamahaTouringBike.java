package com.company.YamahaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ITouringBike;

public class YamahaTouringBike implements ITouringBike {
    @Override
    public Bike createTouringBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Yamaha");
        bike.setType("Туристический");
        bike.setSpeed(150);
        return bike;
    }

}
