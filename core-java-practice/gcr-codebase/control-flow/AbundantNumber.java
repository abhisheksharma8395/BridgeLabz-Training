// This program check if a number is an Abundant Number or not.
import java.util.Scanner;

public class AbundantNumber {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);
        // Taking input for a number from user
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        // Calculating sum of all factors of the number
        int sum = 0;                           // Stores the sum of all factor of the numner
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Checking the condition is number an Abundant number or not.
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
        scanner.close();
    }
}