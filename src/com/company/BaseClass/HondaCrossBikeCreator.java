package com.company.BaseClass;

import com.company.BaseClass.Bike;
import com.company.Interfaces.ICrossBike;

public class HondaCrossBikeCreator extends Bike implements ICrossBike {
    String type;
    int speed;

    public HondaCrossBikeCreator(String factoryName) {
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

//    @Override
//    public void setFactoryName() {
//        this.factoryName = "Honda";
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
