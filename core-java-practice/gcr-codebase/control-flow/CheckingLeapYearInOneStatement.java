// This program check the given year(user input) is leap year or not only in one statement (only using one if-else).

import java.util.Scanner;
public class CheckingLeapYearInOneStatement {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        // Taking the input of year from user
        System.out.println("Enter the year (year should be greater than 1581) : ");
        int year = sc.nextInt();
        // Checking if user input year is less than 1582
        if(year<1582){
            System.out.println("Please enter year greater than 1581 ");
            return;
        }
        // Checking if given year is divisible by 4 and not by 100 or divisible by 400
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year+" is a non leap year");
        }
    }
}

