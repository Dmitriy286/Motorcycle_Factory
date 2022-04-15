package com.company.HondaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ICrossBike;

public class HondaCrossBike implements ICrossBike {
    @Override
    public Bike createCrossBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Honda");
        bike.setType("Кроссовый");
        bike.setSpeed(90);
        return bike;
    }
}
