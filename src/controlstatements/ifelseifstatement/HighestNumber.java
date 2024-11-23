package controlstatements.ifelseifstatement;

import java.util.Scanner;

public class HighestNumber {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public HighestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        this.secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        this.thirdNumber = scanner.nextInt();
    }

    public void printHighest() {
        if (this.firstNumber > this.secondNumber && this.firstNumber > this.thirdNumber) {
            System.out.println("The highest number: " + this.firstNumber);
        }
        else if (this.secondNumber > this.firstNumber && this.secondNumber > this.thirdNumber) {
            System.out.println("The highest number: " + this.secondNumber);
        }
        else {
            System.out.println("The highest number: " + this.thirdNumber);
        }

    }
}


