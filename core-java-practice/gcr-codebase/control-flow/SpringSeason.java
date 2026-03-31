// This program checks for given input date comes in spring season or not.
import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take month and day as input from user
        System.out.print("Enter month (1-12) : ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31) : ");
        int day = sc.nextInt();

        // Check if it's between March 20 to June 20 as spring season is from March 20th to 20th June
        boolean isSpring = (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        // Printing the results
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}