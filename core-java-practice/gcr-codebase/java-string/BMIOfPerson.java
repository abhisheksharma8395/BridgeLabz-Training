// This program takes input for string and checks is String Palindrome or not by three different methods.

import java.util.Scanner;

public class BMIOfPerson {

    // Method to return 2d array in which each person height weight bmi and status are stored
    public static String[][] reports(double[][] heightWeight) {
        String[][] reports = new String[heightWeight.length][4];
        for (int iterator = 0; iterator < heightWeight.length; iterator++) {
            reports[iterator][0] = String.valueOf(heightWeight[iterator][0]);
            reports[iterator][1] = String.valueOf(heightWeight[iterator][1]);
            String[] tempArray = BMIStatus(heightWeight[iterator][0], heightWeight[iterator][1]);
            reports[iterator][2] = tempArray[0];
            reports[iterator][3] = tempArray[1];
        }
        return reports;
    }

    // This method calculate the BMI and Status of the person
    public static String[] BMIStatus(double height, double weight) {
        height = height / 100;        // Converting height into meter
        String[] bmiArray = new String[2];  // Stores the BMI and Status of person
        // Calculating BMI
        double bmi = height / (weight * weight);

        // At first index of bmiArray storing bmi of person
        bmiArray[0] = String.valueOf(bmi);
        // At first index of bmiArray storing status of person
        if (bmi < 18.5) {
            bmiArray[1] = "Underweight";
        } else if (bmi <= 24.9) {
            bmiArray[1] = "Normal";
        } else if (bmi <= 39.9) {
            bmiArray[1] = "Overweight";
        } else {
            bmiArray[1] = "Obese";
        }
        return bmiArray;
    }

    // Method to print the results
    public static void BMI(double[][] heightWeight) {
        String[][] report = reports(heightWeight);
        for (int i = 0; i < report.length; i++) {
            System.out.println("Detail Of "+(i+1)+"th person are : Height -> "+report[i][0]+" , Weight -> "+report[i][1]+" , BMI -> "+report[i][2]+" , Status -> "+report[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        // Stores the Height and Weight of the person
        double[][] heightWeight = new double[10][2];

        for (int i = 0; i < heightWeight.length; i++) {
            boolean flag = true;
            while (flag) {
                System.out.println("Enter height of " + (i + 1) + "th person (in centimeters) : ");
                heightWeight[i][0] = sc.nextDouble();
                System.out.println("Enter weight of " + (i + 1) + "th person (in kilograms): ");
                heightWeight[i][1] = sc.nextDouble();
                if ((heightWeight[i][0] < 0) || (heightWeight[i][1] < 0)) {
                    flag = true;
                    System.out.println("Invalid Inputs for person "+(i+1)+" please try again.");
                }
                else{
                    flag = false;
                }
            }
        }

        // Calling method to Display results
        BMI(heightWeight);

        sc.close();
    }
}

