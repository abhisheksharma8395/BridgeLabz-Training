// This Program calculates the Quotient And Remainder When a number divided by another number
import java.util.Scanner;

public class QuotientAndRemainder {
    // Main method
    public static void main(String[] args) {

        // Creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking Input of number1 from user
        System.out.print("Enter number1 : ");
        int number1 = scanner.nextInt();

        //Taking Input of number2 from user
        System.out.print("Enter number2 : ");
        int number2 = scanner.nextInt();
        
        //Finding Quotient And Remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Printing the result        
        System.out.printf("The Quotient is %d and Remainder is %d when we divide %d by %d\n", quotient, remainder, number1, number2);
    }
}