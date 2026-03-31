// This Program converts distance in feets to yards and miles
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        // creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking input of distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        //Calculating distance in yards from distance in feets 
        double yards = distanceInFeet / 3;

        //Calculating distance in miles from distance in feets
        double miles = yards / 1760;
        
        // Printing the result
        System.out.printf("The distance is %.2f feet, %.2f yards, or %.5f miles\n", distanceInFeet, yards, miles);
    }
}