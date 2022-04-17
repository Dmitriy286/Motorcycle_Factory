package com.company.BaseClass;

public abstract class Bike {
    String factoryName;
    private String type;
    private int speed;

    public Bike (String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Я " + this.type
                + " мотоцикл, еду со скоростью "
                + this.speed + "км/ч. "
                + "Я произведен на фабрике " + this.factoryName + ".";
    }

//    public abstract void setFactoryName();

}
