// This program check the given number by user is prime or not .
import java.util.Scanner;

public class PrimeNumber {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner Class
        Scanner sc = new Scanner(System.in);

        // Taking Input for number from user
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Checking if user gave the value that is less than or equal to 1.
        if (number <= 1) {
            isPrime = false;
        }
        // if user gave the value that is greater than 1.
        else {
            // checking if number is divisible by any of the number between 2 and sqrt(number) if yes then not prime
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Printing the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is Not a Prime Number.");
        }

        sc.close();
    }
}