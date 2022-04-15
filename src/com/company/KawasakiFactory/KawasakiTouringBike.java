package com.company.KawasakiFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ITouringBike;

public class KawasakiTouringBike implements ITouringBike {
    @Override
    public Bike createTouringBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Kawasaki");
        bike.setType("Туристический");
        bike.setSpeed(150);
        return bike;
    }
}
