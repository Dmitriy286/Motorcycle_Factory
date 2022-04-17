package com.company.ConcreteFabrics;

import com.company.BaseClass.Bike;
import com.company.BaseClass.YamahaSportBikeCreator;
import com.company.BaseClass.YamahaTouringBikeCreator;
import com.company.Interfaces.IBikeFactory;


public class YamahaFactory implements IBikeFactory {
    public Bike createSportBike() {
        return new YamahaSportBikeCreator("Yamaha");
    };

    public Bike createCrossBike() {
        return new YamahaSportBikeCreator("Yamaha");
    }

    public Bike createTouringBike() {
        return new YamahaTouringBikeCreator("Yamaha");
    }
}
