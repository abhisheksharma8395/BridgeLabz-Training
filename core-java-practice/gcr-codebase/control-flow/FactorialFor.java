// This program calculate factorial of a number using for loop .
import java.util.Scanner;

public class FactorialFor {
    // Main method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input of a number from users
        System.out.print("Enter a positive integer : ");
        int num = sc.nextInt();

        if (num >= 0) {
            long factorial = 1;

            // Calculate factorial using while loop
            for (int iterator = 1; iterator <= num ; iterator++) {
                factorial *= iterator;
            }
            // Printing the result
            System.out.println("Factorial of " + num + " is " + factorial);
        } else {
            // If user enters a negative number
            System.out.println("Please enter a non-negative integer.");
        }

        sc.close();
    }
}