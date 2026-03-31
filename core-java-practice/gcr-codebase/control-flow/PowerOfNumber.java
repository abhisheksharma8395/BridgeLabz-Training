// This program calculates the power of a number using for loop
import java.util.Scanner;

public class PowerOfNumber {
    // Main method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for number(base) and power from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // In result variable we store our answer
        int result = 1;

        // Calculate power using for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Printing the result
        System.out.println(number + " raised to the power " + power + " is " + result);

        sc.close();
    }
}