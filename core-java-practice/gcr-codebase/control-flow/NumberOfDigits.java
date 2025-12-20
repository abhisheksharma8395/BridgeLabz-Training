// This program takes a number input from user and count the digit in that number.
import java.util.Scanner;

public class NumberOfDigits {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user for a number
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int original = number;
        int digitCounter = 0;

        // Calculating number of digits in number
        while (number != 0) {
            digitCounter++;
            number /= 10;
        }

        // Printing the result
        System.out.println("Total digit in number "+original+" are : "+digitCounter);

        sc.close();
    }
}