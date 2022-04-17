package com.company;

import com.company.BaseClass.Bike;
import com.company.ConcreteFabrics.HondaFactory;
import com.company.ConcreteFabrics.KawasakiFactory;
import com.company.ConcreteFabrics.YamahaFactory;
import com.company.Interfaces.IBikeFactory;
import com.company.Interfaces.ICrossBike;
import com.company.Interfaces.ISportBike;
import com.company.Interfaces.ITouringBike;

import java.util.Objects;

public class Client {
    FactoryConfig config;
    Bike bike;
    IBikeFactory factory;
    String bikeType;
    String commandName;

    public Client () {
        config = new FactoryConfig();
        commandName = config.setCommandNameFromClient();
        bikeType = config.setBikeTypeFromClient();
        factory = new BikeFactory(commandName);
    }

    public Bike createBike() {
        if (Objects.equals(bikeType, "спортивный")) {
            bike = factory.createSportBike();
        }
        else if (Objects.equals(bikeType, "кроссовый")) {
            bike = factory.createCrossBike();
        }
        else if (Objects.equals(bikeType, "туристический")) {
            bike = factory.createTouringBike();
        }
        return bike;
    }
}
