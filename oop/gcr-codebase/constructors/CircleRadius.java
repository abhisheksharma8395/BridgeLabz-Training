// Circle class using constructor chaining
class CircleInfo {
    double radius;

    // Default constructor of CircleInfo
    public CircleInfo() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor of CircleInfo
    public CircleInfo(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleRadius{
    // Main method to test the class
    public static void main(String[] args) {

        //object created using default constructor
        CircleInfo defaultCircle = new CircleInfo();

        //object created using parameterized constructor
        CircleInfo customCircle = new CircleInfo(5.5);

        // Printing Result
        System.out.println("Default Circle:");
        defaultCircle.displayRadius();
        System.out.println("\nCustom Circle:");
        customCircle.displayRadius();
    }
}