package greaternumber;

import java.util.Scanner;

public class GreaterNumberWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The greater number is " +firstNumber);
        } else {
            System.out.println("the greatest number is " +secondNumber);
        }

    }
}
