// This program calculate some operation after taking input from users
import java.util.Scanner;

public class IntOperation {
    // Main Method
    public static void main(String[] args) {
        // Creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //taking Input of a,b,c from user
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        
        int operation1 = a + b * c;     // first operation
        int operation2 = a * b + c;     // second operation
        int operation3 = c + a / b;     // third operation
        int operation4 = a % b + c;     // fourth operation
        
        // Printing the Results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", result1, result2, result3, result4);
    }
}