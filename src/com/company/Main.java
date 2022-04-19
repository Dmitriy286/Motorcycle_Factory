package com.company;

import com.company.BaseClass.*;
import com.company.Interfaces.IBikeFactory;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        Bike newBike = client.createBike();
        System.out.println(newBike);

    }
}
