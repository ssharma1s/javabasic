package objectorientedprogramming.objectclass;

public class EvMain {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle();

        ElectricVehicle electricVehicleCopy1 = new ElectricVehicle();

        ElectricVehicle electricVehicleCopy2 = new ElectricVehicle();

        electricVehicle.brand= "KIA"; // value initialization
        electricVehicle.vin = 1234567;  // Value initialization

        electricVehicleCopy1.brand= "Tesla"; // value initialization
        electricVehicleCopy1.vin = 8765432;  // Value initialization

        electricVehicleCopy2.brand= "Ford"; // value initialization
        electricVehicleCopy2.vin = 9876543;  // Value initialization


        electricVehicle.printBrand(); // method invoke or calling
        electricVehicle.printVin(); // method invoke or calling

        electricVehicleCopy1.printBrand(); // method invoke or calling
        electricVehicleCopy1.printVin(); // method invoke or calling

        electricVehicleCopy2.printBrand(); // method invoke or calling
        electricVehicleCopy2.printVin(); // method invoke or calling

    }
}
