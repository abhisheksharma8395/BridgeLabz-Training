// This program runs a counter from user input value to 1 by using for loop.
import java.util.Scanner;

public class CounterFor {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for a number from user
        System.out.print("Enter starting countdown number : ");
        int counter = sc.nextInt();

        // Counting using for loop
        for (int iterator = counter; iterator > 0; iterator--) {
            System.out.println(iterator);
        }

        System.out.println("Rocket Launched!");
        sc.close();
    }
}