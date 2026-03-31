// This program runs a counter from user input value to 1 by using while loop.
import java.util.Scanner;

public class CounterWhile {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for a number from user
        System.out.print("Enter starting countdown number : ");
        int counter = sc.nextInt();

        // Counting using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");
        sc.close();
    }
}