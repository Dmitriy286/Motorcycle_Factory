package com.company.ConcreteFabrics;

import com.company.BaseClass.Bike;
import com.company.BaseClass.KawasakiCrossBikeCreator;
import com.company.Interfaces.IBikeFactory;
import com.company.BaseClass.KawasakiSportBikeCreator;
import com.company.BaseClass.KawasakiTouringBikeCreator;

public class KawasakiFactory implements IBikeFactory {
    @Override
    public Bike createSportBike() {
        return new KawasakiSportBikeCreator("Kawasaki");
    }

    @Override
    public Bike createCrossBike() {
        return new KawasakiCrossBikeCreator("Kawasaki");
    }

    @Override
    public Bike createTouringBike() {
        return new KawasakiTouringBikeCreator("Kawasaki");
    }
}
