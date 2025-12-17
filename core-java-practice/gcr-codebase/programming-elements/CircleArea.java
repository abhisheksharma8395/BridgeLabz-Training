import java.lang.Math;
import java.util.Scanner;

// Class CircleArea
class CircleArea {
    // Main Method
    public static void main(String[] args) {
        // Creating Object of Scanner Class
        Scanner sc = new Scanner(System.in);

        //Taking input for radius of the circle
        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();

        //calculating area by using formula -> areaOfCircle => πr^2
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + areaOfCircle);
    }
}