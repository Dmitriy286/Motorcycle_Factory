package com.company.YamahaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ISportBike;

public class YamahaSportBike implements ISportBike {
    @Override
    public Bike createSportBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Yamaha");
        bike.setType("Спортивный");
        bike.setSpeed(300);
        return bike;
    }
}
