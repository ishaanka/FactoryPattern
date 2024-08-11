package Util;

import Impl.Bike;
import Impl.Car;
import Impl.Truck;
import Interface.IVehicle;

public class FactoryUtil {
    public static IVehicle getVehicle(String obj) {
        return switch (obj) {
            case "Truck" -> new Truck();
            case "Car" -> new Car();
            case "Bike" -> new Bike();
            default -> null;
        };
    }
}
