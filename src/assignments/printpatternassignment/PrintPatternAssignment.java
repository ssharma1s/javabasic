package assignments.printpatternassignment;

import java.util.Scanner;

public class PrintPatternAssignment {

    public void printPattern() {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        // Loop to print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print stars for each column
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();

    }

    int rows;
    public PrintPatternAssignment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        this.rows = scanner.nextInt();
    }

    public void printRightAngledPattern() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void printInvertedRightAngledTriangle(){
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
