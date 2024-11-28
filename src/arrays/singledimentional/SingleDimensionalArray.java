package arrays.singledimentional;

import java.util.Scanner;

public class SingleDimensionalArray {

    public void explainArray() {
        int[] numbers = {10, 20, 30, 40, 50}; // size: 5
        // float[] floatNumbers = {1.2f, 1.5f};
//        long[]longNumbers = {20, 20, 30, 40, 50};
//        String[] elements ={"Apple", "Mango", "Cherry"};
//        int number = 10;

        //Iterating through the array using a for loop
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Accessed Element: " + numbers[4]);
        //System.out.println("Accessed Element: " + number[5]);// it will give error as this is not defined
        System.out.println("Array Size: " + numbers.length);
        System.out.println("Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elements at index " + i + ": " + numbers[i]);

        }
    }

    public void findMaxMinValue() {
        int[] numbers = {10, 1, 40, 20, 50, 80};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum Number is : " + min);
        System.out.println("Maximum Number is : " + max);
    }

    public void findSumAndAverage() {
        int[] numbers = {10, 1, 40, 20, 50, 80};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];// sum = sum + number[i]
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + sum / numbers.length);
    }

    public void findCountOfEvenAndOdd() {
        int[] numbers = {10, 1, 40, 20, 50, 80, 101, 133, 120, 87, 59, 100, 90, 56, 11, 21, 33};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {  //if (numbers[i] % 2 == 1) {
                countOdd++;
            }
        }
        System.out.println("Even Number is : " + countEven);
        System.out.println("Odd Number is : " + countOdd);

    }

    public void reverseElementOfArray() {
        int[] numbers = {10, 1, 40, 20, 50, 80};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] +  " ");

        }
    }

    public void reverseArray(){
        int[] numbers = {10, 1, 40, 20, 50, 80};

        for (int left= 0, right = numbers.length - 1; left < right ; left++, right--) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
        }

            System.out.println("----After Reverse Order------");
            System.out.println("number[0] : " + numbers[0]);
            System.out.println("number[1] : " + numbers[1]);
            System.out.println("number[2] : " + numbers[2]);
            System.out.println("number[3] : " + numbers[3]);
            System.out.println("number[4] : " + numbers[4]);
            System.out.println("number[5] : " + numbers[5]);
    }

    public void searchElementInArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        //type  variable   object
        System.out.println("Enter " + size + " elements");
        for (int i = 0; i < size; i++) { //i<=size-1
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to search");
        int searchElement = scanner.nextInt();
        Integer searchedIndex =null;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                searchedIndex = i;
                break;
            }
        }
        if (searchedIndex != null) {
            System.out.println("The found index is " + searchedIndex);
        }
        else {
            System.out.println("Element is not found at any index.");
        }

    }
  }


