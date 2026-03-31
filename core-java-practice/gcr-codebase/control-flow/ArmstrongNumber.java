// This program takes a number input from user and check whether the number is an Armstrong number or not.
import java.util.Scanner;

public class ArmstrongNumber {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user for a number
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int original = number;
        int digitSum = 0;

        // Calculate sum of power of digits
        while (number != 0) {
            int digit = number % 10;
            digitSum += digit * digit * digit;
            number /= 10;
        }

        // Check condition is number an Armstrong number or not.
        if (digitSum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is Not an Armstrong Number.");
        }

        sc.close();
    }
}