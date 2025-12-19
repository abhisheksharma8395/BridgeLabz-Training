// This program calculates the power of a number using while loop
import java.util.Scanner;

public class PowerOfNumberWhile {
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
        // Counter set to 1
        int counter = 1;

        // Calculate power using for loop
        while(counter<=number) {
            result *= number;
            counter++;    // incrementing counter
        }

        // Printing the result
        System.out.println(number + " raised to the power " + power + " is " + result);

        sc.close();
    }
}