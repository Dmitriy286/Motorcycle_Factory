package com.company.BaseClass;

import com.company.Interfaces.ICrossBike;
import com.company.Interfaces.ISportBike;

public class YamahaSportBikeCreator extends Bike implements ISportBike {
    String type;
    int speed;

    public YamahaSportBikeCreator(String factoryName) {
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
//        this.factoryName = "Yamaha";
//    }

    @Override
    public String getSportType() {return "спортивный";
    }

    @Override
    public int getSportSpeed() {
        return 300;
    }

}

