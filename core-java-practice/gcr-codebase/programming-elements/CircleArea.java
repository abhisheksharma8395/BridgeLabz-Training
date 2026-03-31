import java.lang.Math;
import java.util.Scanner;

// Class CircleArea
class CircleArea {
    // Main Method
    public static void main(String[] args) {
        // Creating Object of Scanner Class
        Scanner sc = new Scanner(System.in);

        //Taking input for radius of the circle
        System.out.println("Enter radius of the circle : ");
        double radii = sc.nextDouble();

        //calculating area by using formula -> areaOfCircle => π(radii)^2
        double areaOfCircle = Math.PI * radii * radii;
        System.out.printf("Area of the circle is : %.2f", areaOfCircle);
    }
}