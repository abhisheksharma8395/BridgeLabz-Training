// This program is created a calculator using switch...case.
import java.util.Scanner;

public class Calculator {
    // Main method
    public static void main(String[] args) {
        // Obejct of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for two number and for the operator as well
        System.out.print("Enter first number : ");
        double first = sc.nextDouble();
        System.out.print("Enter second number : ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /) : ");
        String op = sc.next();

        // Perform operation based on operator
        switch (op) {
            case "+":
                System.out.printf("Addition of %.2f and %.2f is equals to : %.2f ",first,second,(first + second));
                break;
            case "-":
                System.out.printf("Subtraction of %.2f and %.2f is equals to : %.2f ",first,second,(first - second));
                break;
            case "*":
                System.out.printf("Multiplication of %.2f and %.2f is equals to : %.2f ",first,second,(first * second));;
                break;
            case "/":
                if (second != 0)
                    System.out.printf("Division of %.2f and %.2f is equals to : %.2f ",first,second,(first / second));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid Operator.");
        }

        sc.close();
    }
}