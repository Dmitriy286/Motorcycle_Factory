package com.company;


import com.company.BaseClass.Bike;
import com.company.ConcreteFabrics.HondaFactory;
import com.company.ConcreteFabrics.KawasakiFactory;
import com.company.ConcreteFabrics.YamahaFactory;
import com.company.Interfaces.IBikeFactory;

import java.util.Objects;

public class BikeFactory implements IBikeFactory {
    IBikeFactory factory;
    String commandName;

    public BikeFactory (String commandName) {
        this.commandName = commandName;
        defineFactory(this.commandName);
    }

    public void defineFactory(String commandName) {
        if (Objects.equals(commandName, "Yamaha")) {
            factory = new YamahaFactory();
        }
        else if (Objects.equals(commandName, "Honda")) {
            factory = new HondaFactory();
        }

        else if (Objects.equals(commandName, "Kawasaki")) {
            factory = new KawasakiFactory();
        }

        else {
            System.out.println("Такой команды не существует");
        }
    }

    @Override
    public Bike createSportBike() {
        return factory.createSportBike();
    }

    @Override
    public Bike createCrossBike() {
        return factory.createCrossBike();
    }

    @Override
    public Bike createTouringBike() {
        return factory.createTouringBike();
    }
}
