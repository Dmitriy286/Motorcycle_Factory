package com.company.KawasakiFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ICrossBike;

public class KawasakiCrossBike implements ICrossBike {

    @Override
    public Bike createCrossBike() {
        Bike bike = new Bike();
        bike.setFactoryName("Kawasaki");
        bike.setType("Кроссовый");
        bike.setSpeed(90);
        return bike;
    }
}
