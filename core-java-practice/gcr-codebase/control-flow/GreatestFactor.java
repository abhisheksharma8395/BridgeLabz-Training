// This program prints Greatest factor of number (user input) beside itself by using for loop.
import java.util.Scanner;

public class GreatestFactor {
    // Main method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user for a number whose factor user wants to find.
        System.out.print("Enter a positive integer : ");
        int number = sc.nextInt();

        // If number is positive then the program calculate the Greatest factor.
        if (number > 0) {
            System.out.print("Greatest Factor of " + number + " beside itself is : ");
            // Loop to Greatest factor
            for (int iterator = number-1; iterator > 0; iterator--) {
                if (number % iterator == 0) {
                    System.out.print(iterator );
                    break;
                }
            }
        }
        // If user input negative number
        else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}