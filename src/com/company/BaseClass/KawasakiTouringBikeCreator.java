package com.company.BaseClass;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ITouringBike;

public class KawasakiTouringBikeCreator extends Bike implements ITouringBike {
    String type;
    int speed;

    public KawasakiTouringBikeCreator (String factoryName) {
        super(factoryName);
        this.type = getTouringType();
        this.speed = getTouringSpeed();
    }

    @Override
    public String toString() {
        return "Я " + this.type
                + " мотоцикл, еду со скоростью "
                + this.speed + "км/ч. "
                + "Я произведен на фабрике " + factoryName + ".";
    }

//    @Override
//    public void setFactoryName() {
//        this.factoryName = "Kawasaki";
//    }

    @Override
    public String getTouringType() {
        return "туристический";
    }

    @Override
    public int getTouringSpeed() {
        return 150;
    }
}
