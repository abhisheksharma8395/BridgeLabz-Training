// This program calculates the Body Mass Index of person
// after taking input of weight in kilogram and height in centimeter of that person

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input for weight (in kilogram) and height (in centimeter)
        System.out.print("Enter your weight (in kg) : ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (in cm) : ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculating BMI by using the formula
        double bmi = weight / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Printing The results
        if (bmi < 18.5)
            System.out.printf("Your Body Mass Index is %.2f and your status is Underweight",bmi);
        else if (bmi < 24.9)
            System.out.printf("Your Body Mass Index is %.2f and your status is Normal",bmi);
        else if (bmi < 39.9)
            System.out.printf("Your Body Mass Index is %.2f and your status is Overweight",bmi);
        else
            System.out.printf("Your Body Mass Index is %.2f and your status is Obese",bmi);

        sc.close();
    }
}