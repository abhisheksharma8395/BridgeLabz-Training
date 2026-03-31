// This program prints all the factors of number (user input) by using while loop.
import java.util.Scanner;

public class FactorUsingWhile {
    // Main method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user for a number whose factor user wants to find.
        System.out.print("Enter a positive integer : ");
        int number = sc.nextInt();

        // If number is positive then the program calculate the factor.
        if (number > 0) {
            System.out.println("Factors of " + number + " are : ");
            // Loop to find all factors
            int iterator = 1;
            while (iterator < number) {
                if (number % iterator == 0) {
                    System.out.print(iterator + " , ");
                }
                iterator++;
            }
            System.out.print(number);
        }
        // If user input negative number
        else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}