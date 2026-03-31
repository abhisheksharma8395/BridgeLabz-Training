// This program check whether the given number is Natural number or not if it is then print the sum from 1 to that number
import java.util.Scanner;

public class NaturalNumberSum {
    //Main method
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking Input for that number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for natural number and print sum from 1 to number
        if (number >= 1) {
            // Using Formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        sc.close();
    }
}