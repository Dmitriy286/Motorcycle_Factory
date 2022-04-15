package com.company.BaseClass;

public class Bike {
    private String type;
    private int speed;
    private String factoryName;

    @Override
    public String toString() {
        return "Я " + this.type
                + " мотоцикл, еду со скоростью "
                + this.speed + "км/ч. "
                + "Я произведен на фабрике " + this.factoryName + ".";
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
