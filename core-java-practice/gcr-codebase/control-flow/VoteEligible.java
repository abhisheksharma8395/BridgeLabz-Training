// This program check whether the person is eligible for vote or not
import java.util.Scanner;

public class VoteEligible {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for user age
        System.out.print("Enter Your age : ");
        int age = sc.nextInt();

        // Checking is user age is greater than 18 or not
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}