package com.company;

import java.util.Scanner;

public class FactoryConfig {
    String commandName;
    String bikeType;
//
//    public FactoryConfig () {
//        this.commandName = setCommandNameFromClient();
//        this.bikeType = setBikeTypeFromClient();
//    }

    public String setCommandNameFromClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название команды");
        commandName = scanner.next();
        return commandName;
    }

    public String setBikeTypeFromClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип мотоцикла");
        bikeType = scanner.next();
        return bikeType;
    }
}
