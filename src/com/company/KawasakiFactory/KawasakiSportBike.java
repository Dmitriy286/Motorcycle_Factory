package com.company.KawasakiFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ISportBike;

public class KawasakiSportBike implements ISportBike {
    @Override
    public Bike createSportBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Kawasaki");
        bike.setType("Спортивный");
        bike.setSpeed(300);
        return bike;
    }
}
