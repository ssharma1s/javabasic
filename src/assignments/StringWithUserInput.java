package assignments;

import java.util.Scanner;

public class StringWithUserInput {
    public static void main(String[] args) {
        Scanner scannerVariable = new Scanner(System.in);
        System.out.print("Enter First Name :");
        String firstName= scannerVariable.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scannerVariable.nextLine();

        System.out.println( "The User's Fullname is : " + firstName + " " + lastName);
    }
}
