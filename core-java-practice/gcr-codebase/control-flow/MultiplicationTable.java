// This program prints the multiplication table of user input number.
import java.util.Scanner;

public class MultiplicationTable {
    // Main Method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input of number from user
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // Print table of number from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        // Closing scanner
        sc.close();
    }
}