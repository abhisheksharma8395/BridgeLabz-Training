import java.util.Scanner;

class Power {
    // Main Method
    public static void main(String[] args) {
        // Creating the object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input of Base from user
        System.out.println("Enter base:");
        int base = sc.nextInt();
 
        // Taking input of exponent from user
        System.out.println("Enter exponent:");
        int exponent = sc.nextInt();

        // Calculating the result without using loop and conditionals
        int result = (int)Math.pow(b, e);
        System.out.println(b + " raised to the power " + e + " is: " + result);
    }
}