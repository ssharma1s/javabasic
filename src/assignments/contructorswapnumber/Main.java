package assignments.contructorswapnumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // for the user input we need scanner function from java library
//        System.out.println("Enter first number");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter second number");
//        int secondNumber = scanner.nextInt();

        InputNumber inputNumber = new InputNumber();

        ConstructorSwapNumber constructorSwapNumber = new ConstructorSwapNumber(inputNumber.firstNumber,inputNumber.secondNumber); //create object

       System.out.println("Before swapping: First Number =" + constructorSwapNumber.firstNumber + " Second Number =" + constructorSwapNumber.secondNumber);

        constructorSwapNumber.getSwapNumber(); // this method will get the logic written in the java file for swapping
        System.out.println("After swapping: First number= " + constructorSwapNumber.firstNumber + ", Second Number = " + constructorSwapNumber.secondNumber);
    }
}
