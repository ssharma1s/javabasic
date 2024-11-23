package operators.arithmeticoperators.evennumber;

import java.util.Scanner;

public class EvenNumber {
    int userNumber;

    public EvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        this.userNumber = scanner.nextInt();
    }

    public void printEvenNumber() {
        if (this.userNumber % 2 == 0) {
            System.out.println("The number " + this.userNumber + "  is even");
        } else {
            System.out.println("The number " + this.userNumber + "  is odd");
        }
    }
}