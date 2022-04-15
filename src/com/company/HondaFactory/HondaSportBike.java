package com.company.HondaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ISportBike;

public class HondaSportBike implements ISportBike {

    @Override
    public Bike createSportBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Honda");
        bike.setType("Спортивный");
        bike.setSpeed(300);
        return bike;
    }
}
