package com.company;

import com.company.BaseClass.Bike;

public class Main {

    public static void main(String[] args) {
	AbstractBikeFactory factory = new AbstractBikeFactory();
    factory.setCommand("Kawasaki");
    Bike firstBike = factory.createSportBike();
    System.out.println(firstBike);
    Bike secondBike = factory.createCrossBike();
    System.out.println(secondBike);

    }
}
