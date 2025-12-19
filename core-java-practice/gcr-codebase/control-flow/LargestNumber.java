// This program checks for the largest number between these 3 numbers.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input of three numbers from user
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        // Check which number is the largest
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num2));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num1));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2));

        sc.close();
    }
}