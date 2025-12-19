// This program calculates the sum of all user input until user entered 0.
import java.util.Scanner;

public class SumOfNumbersUntilZeroOrNegative{
    //Main method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop) : ");
            double input = sc.nextDouble();

            // Stop the loop if the input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Add input to total
            total += input;
        }

        // Printing the result
        System.out.println("The total sum is : " + total);
        sc.close();
    }
}