import Interface.IVehicle;
import Util.FactoryUtil;

public class Main {
    public static void main(String[] args) {
        IVehicle vehicle1 = FactoryUtil.getVehicle("Truck");
        vehicle1.drive();
        System.out.println("Hello world!");
    }
}