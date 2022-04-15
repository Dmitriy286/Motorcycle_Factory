package com.company;

import com.company.BaseClass.Bike;
import com.company.HondaFactory.HondaFactory;
import com.company.Interfaces.IBikeFactory;
import com.company.KawasakiFactory.KawasakiFactory;
import com.company.YamahaFactory.YamahaFactory;

import java.util.Objects;

public class AbstractBikeFactory implements IBikeFactory {
    String commandName;

    public void setCommand (String commandName) {
        this.commandName = commandName;
    }

    @Override
    public Bike createSportBike() {
//fixme название метода createSportBike дублируется с таким же методом в YamahaFactory (и т.д.)
//fixme и с конкретным методом по производству спортбайков. Насколько это правидльно?
        IBikeFactory factory;
        if (Objects.equals(commandName, "Honda")) {
            factory = new HondaFactory();
        }

        else if (Objects.equals(commandName, "Yamaha")) {
            factory = new YamahaFactory();
        }

        else if (Objects.equals(commandName, "Kawasaki")) {
            factory = new KawasakiFactory();
        }

        else {
            System.out.println("Такой команды не существует");
            return null;
        }
        return factory.createSportBike();
    }

    @Override
    public Bike createCrossBike() {
        IBikeFactory factory;
        if (Objects.equals(commandName,"Honda")) {
            factory = new HondaFactory();
        }

        else if (Objects.equals(commandName, "Yamaha")) {
            factory = new YamahaFactory();
        }

        else if (Objects.equals(commandName, "Kawasaki")) {
            factory = new KawasakiFactory();
        }

        else {
            System.out.println("Такой команды не существует");
            return null;
        }
        return factory.createCrossBike();
    }

    @Override
    public Bike createTouringBike() {
        IBikeFactory factory;
        if (Objects.equals(commandName, "Honda")) {
            factory = new HondaFactory();
        }

        else if (Objects.equals(commandName, "Yamaha")) {
            factory = new YamahaFactory();
        }

        else if (Objects.equals(commandName, "Kawasaki")) {
            factory = new KawasakiFactory();
        }

        else {
            System.out.println("Такой команды не существует");
            return null;
        }
        return factory.createTouringBike();
    }
}
