import java.util.Scanner;

class RectanglePerimeter {
    // Main method
    public static void main(String[] args) {
        
        // Creating the object of Scanner class
        Scanner sc = new Scanner(System.in);
       
        // Taking Input of length of the rectangle from user
        System.out.println("Enter length of the rectangle : ");
        double length = sc.nextDouble();

        // Taking Input of width of the rectangle from user
        System.out.println("Enter width of the rectangle : ");
        double width = sc.nextDouble();

        // Calculating the perimeter of rectangle
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle is : " + perimeter);
    }
    
}