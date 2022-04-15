package com.company.HondaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ITouringBike;

public class HondaTouringBike implements ITouringBike {
    @Override
    public Bike createTouringBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Honda");
        bike.setType("Туристический");
        bike.setSpeed(150);
        return bike;
    }
}
