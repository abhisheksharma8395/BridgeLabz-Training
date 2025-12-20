// This program check whether the given number is divisible by 5 or not

import java.util.Scanner;

public class DivisibleBy5 {
    // Main method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking Input for a number from user
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by 5.");
        }

        sc.close();
    }
}