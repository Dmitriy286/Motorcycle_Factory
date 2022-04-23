package com.company.BaseClass;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ISportBike;

public class KawasakiSportBikeCreator extends Bike implements ISportBike {
    String type;
    int speed;

    public KawasakiSportBikeCreator(String factoryName) {
        super(factoryName);
        this.type = getSportType();
        this.speed = getSportSpeed();
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
    public String getSportType() {
        return "спортивный";
    }

    @Override
    public int getSportSpeed() {
        return 300;
    }
}
