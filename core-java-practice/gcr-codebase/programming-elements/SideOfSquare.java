// This programme calculates the side of square when perimeter is given.

import java.util.Scanner;
public class SideOfSquare {
    
    // Main method
    public static void main(String[] args) {
        
        // Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking Input of perimeter of square from User
        System.out.print("Enter perimeter : ");
        double perimeter = scanner.nextDouble();

        //Calculating Sides from formula perimeter of square = 4* side
        double side = perimeter / 4;

        // Printing the result
        System.out.printf("Side of the square is %.2f whose perimeter is %.2f\n", side, perimeter);
        
        scanner.close();
    }
}