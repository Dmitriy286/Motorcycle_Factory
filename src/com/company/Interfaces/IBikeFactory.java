package com.company.Interfaces;

import com.company.BaseClass.Bike;

public interface IBikeFactory {
    public Bike createSportBike();
    public Bike createCrossBike();
    public Bike createTouringBike();
}
