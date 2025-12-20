// This program takes input of date and prints the day of the week that the date falls on

import java.util.Scanner;

public class DayOfWeek {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for date from user
        System.out.print("Enter day (1-31) : ");
        int day = sc.nextInt();
        System.out.print("Enter month (1-12) : ");
        int month = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        // Apply Zeller's formula
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (day + x + (31 * m0) / 12) % 7;

        // Printing the result
        switch (dayOfWeek) {
            case 0:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Sunday.");
                break;
            case 1:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Monday.");
                break;
            case 2:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Tuesday.");
                break;
            case 3:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Wednesday.");
                break;
            case 4:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Thursday.");
                break;
            case 5:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Friday.");
                break;
            case 6:
                System.out.println("On the date " + day + "-" + month + "-" + year + " day is Saturday.");
                break;
        }

    }
}