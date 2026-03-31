// This program takes a number as input and calculates is it a harshad number or not
import java.util.Scanner;

public class HarshadNumber {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for a number from user
        System.out.print("Enter an integer : ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;

        // Calculate sum of digits
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        // Check if original number is divisible by sum of its digits
        // if number is divisible by sum of its digit then it is called a harshad number
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is Not a Harshad Number.");
        }

        sc.close();
    }
}