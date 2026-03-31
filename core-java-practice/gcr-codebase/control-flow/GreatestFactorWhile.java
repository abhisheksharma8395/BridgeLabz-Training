// This program prints Greatest factor of number (user input) beside itself by using while loop.
import java.util.Scanner;

public class GreatestFactorWhile {
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
            int counter = number - 1;
            // Loop to Greatest factor
            while (counter > 0) {
                if (number % counter == 0) {
                    System.out.print(counter);
                    break;
                }
                counter--;
            }
        }
        // If user input negative number
        else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}