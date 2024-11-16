package assignments.contructorswapnumber;

import java.util.Scanner;

public class InputNumber {

    int firstNumber;
    int secondNumber;

    public InputNumber(){
        Scanner scanner = new Scanner(System.in); // for the user input we need scanner function from java library
        System.out.println("Enter first number");
        this.firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        this.secondNumber = scanner.nextInt();

    }
}
