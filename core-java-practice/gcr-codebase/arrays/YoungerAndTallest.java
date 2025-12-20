// This program prints the name of youngest and the tallest among three friend Amar Akbar and Anthony.

import java.util.Scanner;

public class YoungerAndTallest {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];                           // Stores the age of three friends
        double[] heights = new double[3];                  // Stores the height of three friends

        // Input age and height for each friend
        System.out.println("Enter age and height for 3 friends:");
        for (int i = 0; i < 3; i++) {
            System.out.print(friends[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print(friends[i] + "'s height (cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest friend between these three friend
        int youngestAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngest = friends[i];
            }
        }

        // Find the tallest friend  between these three friend.
        double tallestHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallest = friends[i];
            }
        }

        // Displaying the result
        System.out.println("\nResults:");
        System.out.println("Youngest friend: " + youngest + " (age " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallest + " (height " + tallestHeight + "cm)");

    }
}
