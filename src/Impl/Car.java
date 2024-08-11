package Impl;

import Interface.IVehicle;

public class Car implements IVehicle {

    @Override
    public void drive() {
        System.out.println("Car drive");
    }
}
