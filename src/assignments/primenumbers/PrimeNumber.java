package assignments.primenumbers;

import java.util.Scanner;

public class PrimeNumber {
    int userNumber;

    public PrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        this.userNumber = scanner.nextInt();
    }

    public void printPrimeNumber() {
        if ((this.userNumber % this.userNumber== 0 )&& (this.userNumber>1) && (this.userNumber<4)) {
            System.out.println("The number entered " + this.userNumber + " is Prime Number.");
        }
        else if ((this.userNumber % this.userNumber >=1) && (this.userNumber < 10)){
            System.out.println("The number entered " + this.userNumber + " is not Prime Number.");
        }
    }
}
