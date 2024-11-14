package objectorientedprogramming.objectclass;

public class ElectricVehicle {

    String brand; // trying to work with attributes of the class note:no need to declare method, attributes and methods are mutually exclusive

    long vin;

    public void printBrand() {
        System.out.println("Brand: " + brand);
    }
    public void printVin() {
        System.out.println("Vin: " + vin);
    }

}
