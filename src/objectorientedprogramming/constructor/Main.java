package objectorientedprogramming.constructor;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.myMethod();

        ElectricVehicle electricVehicleParameterized = new ElectricVehicle("Tesla",12345L);
        System.out.println(electricVehicleParameterized.brand);
        System.out.println(electricVehicleParameterized.vin);

    }
}
