//This programme converts height in centimeters to feet and inches.
import java.util.Scanner;

public class HeightInFeetAndInches {

    public static void main(String[] args) {
        // Object of Scanner Class
        Scanner input = new Scanner(System.in);

        // Taking input for height in cm from user
        System.out.print("Enter your height in centimeters : ");
        double heightCm = input.nextDouble();

        // Converting centimeters to inches (1 inch = 2.54 cm)
        double heightInches = heightCm / 2.54;

        // Converting inches to feet (1 foot = 12 inches)
        int feet = (int)(heightInches / 12);
        double remainingInches = heightInches % 12;

        // Output the result
        System.out.printf("Your Height in cm is %.2f cm while in feet is %d foot and %.2f inches",heightCm,feet,remainingInches);
    }
}