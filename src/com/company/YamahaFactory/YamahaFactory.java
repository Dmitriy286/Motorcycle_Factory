package com.company.YamahaFactory;

import com.company.BaseClass.Bike;
import com.company.Interfaces.IBikeFactory;


public class YamahaFactory implements IBikeFactory {
    public Bike createSportBike() {
        return new YamahaSportBike().createSportBike(); //fixme не уверен, что правильно реализовано. Разве мы должны вызвать здесь метод,
        //fixme а не просто возвращать new Class? Но в том случае отдличается тип возвращаемого значения и ожидаемого.
    };

    public Bike createCrossBike() {
        return new YamahaCrossBike().createCrossBike();
    }

    public Bike createTouringBike() {
        return new YamahaTouringBike().createTouringBike();
    }
}
