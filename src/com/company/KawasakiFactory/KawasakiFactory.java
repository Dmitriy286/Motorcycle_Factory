package com.company.KawasakiFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.IBikeFactory;

public class KawasakiFactory implements IBikeFactory {
    @Override
    public Bike createSportBike() {
        return new KawasakiSportBike().createSportBike();
    }

    @Override
    public Bike createCrossBike() {
        return new KawasakiCrossBike().createCrossBike();
    }

    @Override
    public Bike createTouringBike() {
        return new KawasakiTouringBike().createTouringBike();
    }
}
