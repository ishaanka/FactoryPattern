package Impl;

import Interface.IVehicle;

public class Truck implements IVehicle {

    @Override
    public void drive() {
        System.out.println("Truck drive");
    }
}
