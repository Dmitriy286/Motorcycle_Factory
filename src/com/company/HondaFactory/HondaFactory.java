package com.company.HondaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.IBikeFactory;

public class HondaFactory implements IBikeFactory {
    public Bike createSportBike() {
        return new HondaSportBike().createSportBike();
    };
    public Bike createCrossBike() {
        return new HondaCrossBike().createCrossBike();
    };
    public Bike createTouringBike() {
        return new HondaTouringBike().createTouringBike();
    };
}
