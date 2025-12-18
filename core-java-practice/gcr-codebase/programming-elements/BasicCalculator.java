// This programme creates a Basic Calculator that does operations like Addition , Subtraction , Multiplication and Division.

import java.util.Scanner;
public class BasicCalculator {
    // Main method
    public static void main(String[] args) {

        // creating object of Scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking input for first number        
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();

        // Taking input for second number
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        
        // Addition Operation
        double addition = number1 + number2;

        // Subtraction Operation
        double subtraction = number1 - number2;

        // Multiplication Operation
        double multiplication = number1 * number2;

         // Division Operation
        double division = number1 / number2;

        // Printing The Result      
        System.out.printf("The addition, subtraction, multiplication and division value of numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", number1, number2, addition, subtraction, multiplication, division);
        
    }
}