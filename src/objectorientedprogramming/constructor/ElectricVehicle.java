package objectorientedprogramming.constructor;

    public class ElectricVehicle {
        String brand;
        Long vin;

        public ElectricVehicle() {// constructor
            System.out.println("I am  a constructor and I am called when object is created");
        }
        // parameterized constructor
        public ElectricVehicle(String brand, Long vin) {
            this.brand = brand;
            this.vin = vin;
            System.out.println("I am parameterized Constructor");

        }

        public void myMethod(){
            System.out.println("this is my method");
        }
}
