import java.util.Scanner;

class KilometersToMiles {
    public static void main(String[] args) {
        
        //Object of Scanner Class
        Scanner sc = new Scanner(System.in);
      
        // Taking input of Kilometers from users
	    System.out.println("Enter distance in kilometers : ");
        double kilometers = sc.nextDouble();

        // Calculating the total miles
	    double miles = kilometers / 1.6;
        System.out.printf("%.2f kilometers is equal to %.2f miles.",kilometers,miles);
    }
}
