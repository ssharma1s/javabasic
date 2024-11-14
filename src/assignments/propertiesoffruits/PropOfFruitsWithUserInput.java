package assignments.propertiesoffruits;

import java.util.Scanner;

public class PropOfFruitsWithUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PropertiesOfFruits prop = new PropertiesOfFruits();
        System.out.print("Enter Fruit Color: ");
        prop.fruitColor= sc.nextLine();
        System.out.print("Enter Fruit Name: ");
        prop.fruitName= sc.nextLine();
        System.out.print("Enter Fruit Type: ");
        prop.fruitType= sc.nextLine();
        prop.fruitColor();
        prop.fruitName();
        prop.fruitType();

    }
}
