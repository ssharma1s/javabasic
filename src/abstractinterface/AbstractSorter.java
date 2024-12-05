package abstractinterface;

import java.util.Scanner;

abstract class AbstractSorter implements SorterInterface{
    protected int[] numbers;
    protected int size;

    // method overriding
    @Override
    public void askNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many numbers do you want to sort?");
        size = scanner.nextInt();
        numbers = new int[size];

        for (int i = 0; i < size; i++){

            System.out.print("Enter number: " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }
    }

    @Override
    public void printNumbers(){

    }

}
