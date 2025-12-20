// This program prints the multiplication table of a user input number

import java.util.Scanner;

public class TableOfNumber {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking Input for a number from user
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // filling the table array
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Printing the result
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

    }
}
