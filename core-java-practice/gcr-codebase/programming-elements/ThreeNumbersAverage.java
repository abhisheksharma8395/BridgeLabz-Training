import java.util.Scanner;

class ThreeNumbersAverage {
    //Main Method
    public static void main(String[] args) {
        // Creating Object of Scanner Class
        Scanner sc = new Scanner(System.in);

        // taking input for first number
        System.out.println("Enter first number : ");
        double num1 = sc.nextDouble();

        // taking input for second number
        System.out.println("Enter second number : ");
        double num2 = sc.nextDouble();

        // taking input for third number
	    System.out.println("Enter third number : ");
        double num3 = sc.nextDouble();

        //calculating result
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of the three numbers is : " + average);
    }
}