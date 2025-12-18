// This program calculate some operation after taking input from users
import java.util.Scanner;

public class DoubleOpt {
    // Main method
    public static void main(String[] args) {
        
        // Creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //taking Input of a,b,c from user
        System.out.print("Enter a: ");
        double a = scanner.nextInt();

        System.out.print("Enter b: ");
        double b = scanner.nextInt();

        System.out.print("Enter c: ");
        double c = scanner.nextInt();
        
        double operation1 = a + b * c;     // first operation
        double operation2 = a * b + c;     // second operation
        double operation3 = c + a / b;     // third operation
        double operation4 = a % b + c;     // fourth operation
        
        // Printing the Results
        System.out.printf("The results of Int Operations are %.2f, %.2f, %.2f, and %.2f\n", result1, result2, result3, result4);
    }
}