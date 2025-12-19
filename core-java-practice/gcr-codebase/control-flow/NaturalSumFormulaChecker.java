// This program checks the sum by formula and individual sum of each number by for loop from 1 to n is equal or not.
import java.util.Scanner;

public class NaturalSumFormulaChecker {
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input of number from user
        System.out.print("Enter a natural number : ");
        int number = sc.nextInt();

        // Firstly checking the number input by user is natural number or not.
        if (number > 0) {
            int sum = 0;
            // Sum using while loop
            for (int iterator = 1; iterator <= number; iterator++) {
                sum += iterator;
                iterator++;
            }

            // Sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Print both results
            System.out.println("Sum using For loop : " + sum);
            System.out.println("Sum using formula : " + formulaSum);
        } else {
            System.out.println("The number is not a natural number.");
        }

        sc.close();
    }
}