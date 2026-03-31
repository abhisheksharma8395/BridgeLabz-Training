// This program checks the sum by formula and individual sum of each number by while loop from 1 to n is equal or not.
import java.util.Scanner;

public class NaturalSumFormulaCheckerByUsingForLoop {
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input of number from user
        System.out.print("Enter a natural number : ");
        int number = sc.nextInt();

        if (number > 0) {
            int sum = 0;
            int iterator = 1;

            // Sum using while loop
            while (iterator <= number) {
                sum += iterator;
                iterator++;
            }

            // Sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Print both results
            System.out.println("Sum using while loop : " + sum);
            System.out.println("Sum using formula : " + formulaSum);
        } else {
            System.out.println("The number is not a natural number.");
        }

        sc.close();
    }
}