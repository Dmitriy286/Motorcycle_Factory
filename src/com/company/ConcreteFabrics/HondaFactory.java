package com.company.ConcreteFabrics;

import com.company.BaseClass.Bike;
import com.company.BaseClass.HondaCrossBikeCreator;
import com.company.BaseClass.HondaSportBikeCreator;
import com.company.BaseClass.HondaTouringBikeCreator;
import com.company.Interfaces.IBikeFactory;

public class HondaFactory implements IBikeFactory {
    public Bike createSportBike() {
        return new HondaSportBikeCreator("Honda");
    };
    public Bike createCrossBike() {
        return new HondaCrossBikeCreator("Honda");
    };
    public Bike createTouringBike() {
        return new HondaTouringBikeCreator("Honda");
    };
}
