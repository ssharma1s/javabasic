package assignments.primenumbers;

public class PrimeNumberCheck {

    public void isPrimeNumber(int number) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("the number is not a prime number.");
        }
    }

    public boolean isPrime(int number) {
        boolean isPrime = number > 1;
        System.out.println("check number >1");
        System.out.println(number > 1);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public void checkPrimeWithDivisionCount(int number) {
        int divisionCount =1;
        for ( int i = 2; i <= number; i++) {
            if (number % i == 0) {
                divisionCount++;
            }
            if (divisionCount > 2) {
                break;
            }
        }

           if (divisionCount == 2){
               System.out.println("The number is a prime number.");
           } else {
                System.out.println("the number is not a prime number.");
           }

    }
}
