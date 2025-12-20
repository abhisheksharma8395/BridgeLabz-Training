// This program takes input for 5 number and specify them as positive negative and odd even.
import java.util.Scanner;
public class CheckNumbers {
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);
        // Array for storing 5 number input
        int[] numbers = new int[5];

        // Taking input for 5 number from users
        System.out.println("Enter 5 numbers :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
        }

        // Classify numbers as positive negative and zero.
        for (int number : numbers) {
            if (number > 0) {
                System.out.print(number + " is positive and ");
                System.out.println(number % 2 == 0 ? "even" : "odd");
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare first and last elements of stored into array
        System.out.print("First and last elements are ");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("first is greater than last.");
        } else {
            System.out.println("first is less than last.");
        }

    }
}
