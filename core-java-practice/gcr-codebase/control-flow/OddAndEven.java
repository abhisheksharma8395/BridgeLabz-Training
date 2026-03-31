// OddEvenPrinter.java
import java.util.Scanner;

public class OddAndEven {
    // Main Method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer : ");
        int number = sc.nextInt();

        if (number > 0) {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
        // If user Enter the negative number
        else {
            System.out.println("Enter a positive number.");
        }

        sc.close();
    }
}