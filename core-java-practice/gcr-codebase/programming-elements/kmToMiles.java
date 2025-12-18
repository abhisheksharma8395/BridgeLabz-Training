//This Programme converts a given distance in kilometers to miles.
public class kmToMiles {

    //Main method
    public static void main(String[] args) {

        // Given distance in Kilometers
        double kilometers = 10.8;

        // Calculating Miles from Kilometers As we know 1 miles = 1.6 kilometers
        double miles = kilometers / 1.6;

        // Printing the result
        System.out.println("The distance " + kilometers + " Kilometers in miles is " + miles);
    }
}