// This program checks is the first number smallest of the three number
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for 3 numbers from the user
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        // Check if first is the smallest
        if (num1 < num2 && num1 < num3) {
            System.out.println("Yes, the first number is the smallest.");
        } else {
            System.out.println("No, the first number is not the smallest.");
        }

        sc.close();
    }
}