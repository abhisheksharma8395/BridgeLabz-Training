// This program take a number as user input, and check for a positive integer. If positive integer,
// loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz",
// and for multiples of both print "FizzBuzz" by using While loop.
import java.util.Scanner;

public class FizzBuzz {
    // Main method
    public static void main(String[] args) {
        // Created Scanner class object for taking user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user for a number
        System.out.print("Enter a positive integer : ");
        int number = sc.nextInt();

        // If number is greater than 0 than only it will run
        if (number > 0) {
            int iterator = 1;
            while (iterator <= number) {
                // Checking if the value of iterator is divisible by both 3 and 5.
                if (iterator % 3 == 0 && iterator % 5 == 0)
                    System.out.println("FizzBuzz");
                // Checking if the value of iterator is divisible by both 3.
                else if (iterator % 3 == 0)
                    System.out.println("Fizz");
                // Checking if the value of iterator is divisible by both 3.
                else if (iterator % 5 == 0)
                    System.out.println("Buzz");
                // If it is neither divisible by 3 nor 5.
                else
                    System.out.println(iterator);
                iterator++;   // incrementing
            }
        }
        // If user gave a negative value in input.
        else {
            System.out.println("Please enter a positive integer.");
        }
        // Closing the Scanner.
        sc.close();
    }
}