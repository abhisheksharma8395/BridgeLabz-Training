// This program check whether the given number is positive negative or zero.
import java.util.Scanner;

public class NumberSign {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input of a number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking for sign
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}