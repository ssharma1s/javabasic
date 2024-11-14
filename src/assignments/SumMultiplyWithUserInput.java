package assignments;

import java.util.Scanner;

public class SumMultiplyWithUserInput {
    public static void main(String[] args) {
        Scanner scannerVariable = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNumber = scannerVariable.nextFloat();

        System.out.print("Enter second number:");
        float secondNumber = scannerVariable.nextFloat();
        float sumOfNumbers = firstNumber + secondNumber;
        float multiplicationOfNumbers = firstNumber * secondNumber;

        System.out.println("The Sum of these numbers is " +sumOfNumbers);
        System.out.println("the multiplication of these numbers is " +multiplicationOfNumbers);

    }
}
