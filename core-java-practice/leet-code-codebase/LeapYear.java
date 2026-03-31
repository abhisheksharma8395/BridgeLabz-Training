// This program check the given year(user input) is leap year or not.

import java.util.Scanner;

public class LeapYear {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        // Taking the input of year from user
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        // Checking if given year is divisible by 4
        if (year % 4 == 0) {
            // If given year is divisible by 4 but not 100 then the year is said to leap year
            if (year % 100 != 0) {
                System.out.println(year + " is a leap year.");
            }
            // If given year is divisible by 4 and also by 100 then we have two conditions
            if (year % 100 == 0) {
                // If given year is divisible by 4 and also by 100 but not by 400 then it is not a leap year
                if (year % 400 != 0) {
                    System.out.println("The Entered year is not a leap year");
                }
                // If given year is divisible by 4 , 100 and also by 400 then it is a leap year
                else {
                    System.out.println("The Entered year is a leap year");
                }
            }
        }
    }
}
