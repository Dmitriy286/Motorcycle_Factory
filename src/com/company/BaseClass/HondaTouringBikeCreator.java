package com.company.BaseClass;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ITouringBike;

public class HondaTouringBikeCreator extends Bike implements ITouringBike {
    String factoryName;
    String type;
    int speed;

    public HondaTouringBikeCreator(String factoryName) {
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
//        this.factoryName = "Honda";
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
