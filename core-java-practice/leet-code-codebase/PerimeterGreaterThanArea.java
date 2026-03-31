// This program Checks if the perimeter of the square is greater than area of rectangle.

import java.util.Scanner;

public class PerimeterGreaterThanArea {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner Class
        Scanner sc = new Scanner(System.in);
        // Taking input for length and breadth of rectangle
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();

        // Calculate the area of square
        int area = length * breadth;
        // Calculating the perimeter of rectangle
        int perimeter = 2 * (length + breadth);

        // Checking which is greater among area and perimeter
        if (area < perimeter) {
            System.out.println("Perimeter is greater than area");
        } else if (perimeter < area) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Both Area And Perimeter are equal");
        }
    }
}
