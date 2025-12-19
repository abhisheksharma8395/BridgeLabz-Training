// This program takes input below 100 and checks the multiples of that number between 100 and 1 using for loop
import java.util.Scanner;

public class MultiplesUsingFor {
    // Main Method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number less than 100 and greater than 0 : ");
        int number = sc.nextInt();

        // Checking the user input is in range between 100 and 0
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 101 (in reverse):");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Number must be a positive integer less than 100.");
        }

        sc.close();
    }
}