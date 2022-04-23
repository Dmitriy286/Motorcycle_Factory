package com.company.BaseClass;

import com.company.Interfaces.ICrossBike;

public class KawasakiCrossBikeCreator extends Bike implements ICrossBike {
    String type;
    int speed;

    public KawasakiCrossBikeCreator(String factoryName) {
        super(factoryName);
        this.type = getCrossType();
        this.speed = getCrossSpeed();
    }

    @Override
    public String toString() {
        return "Я " + this.type
                + " мотоцикл, еду со скоростью "
                + this.speed + "км/ч. "
                + "Я произведен на фабрике " + factoryName + ".";
    }

    //    public void setFactoryName() {
//        this.factoryName = "Kawasaki";
//    }
    @Override
    public String getCrossType() {
        return "кроссовый";
    }

    @Override
    public int getCrossSpeed() {
        return 90;
    }

}
