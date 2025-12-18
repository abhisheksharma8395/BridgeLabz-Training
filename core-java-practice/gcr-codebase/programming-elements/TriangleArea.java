// This programme calculates the area of Triangle when base and height is given
import java.util.Scanner;
public class TriangleArea {
    // Main method
    public static void main(String[] args) {

        // Object of Scanner Class
        Scanner scanner = new Scanner(System.in);
        
        // Taking Input of base of triangle from user
        System.out.print("Enter base of Triangle in inches : ");
        double base = scanner.nextDouble();

        // Taking Input of height of triangle from user
        System.out.print("Enter height of Triangle in inches : ");
        double height = scanner.nextDouble();
        
        // Calculates the area of triangle 
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;
        
        System.out.printf("Area of triangle is %.2f square inches or %.2f square centimeters\n", areaInches, areaCm);
        
        scanner.close();
    }
}