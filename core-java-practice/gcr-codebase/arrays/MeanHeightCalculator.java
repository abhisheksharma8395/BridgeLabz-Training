// This program calculates the mean height of players present in a football team

import java.util.Scanner;

public class MeanHeightCalculator {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights for 11 players
        System.out.println("Enter heights of 11 football players (in meters) : ");
        for (int iterator = 0; iterator < heights.length; iterator++) {
            boolean flag = false;
            while (!flag) {
                System.out.print("Please Enter Player " + (iterator + 1) + " height : ");
                heights[iterator] = sc.nextDouble();
                if (heights[iterator] < 0.0){
                    flag = false;
                    System.out.println("Height Can't be negative please enter again ");
                }
                else{
                    sum += heights[iterator];
                    flag = true;
                }
            }
        }

        // Calculating and printing mean height
        double mean = sum / heights.length;
        System.out.printf("Mean height of the team: %.2f meters\n", mean);
    }
}
