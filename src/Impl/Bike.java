package Impl;

import Interface.IVehicle;

public class Bike implements IVehicle {

    @Override
    public void drive() {
        System.out.println("Bike driving");
    }
}
