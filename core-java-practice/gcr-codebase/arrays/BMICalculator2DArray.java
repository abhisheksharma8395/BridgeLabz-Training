// This program calculate the BMI of multiple person after taking the input of their weight and height Using 2D array
import java.util.Scanner;

public class BMICalculator2DArray {
    // Main Method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Taking input for total number of persons
        System.out.print("Enter number of persons : ");
        int numberOfPersons = scanner.nextInt();

        // 2D array to store weight, height, BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Taking input for weight in kilogram and height in centimeter
        for (int i = 0; i < numberOfPersons; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nPerson " + (i + 1) + " weight (kg) : ");
                personData[i][0] = scanner.nextDouble();
                System.out.print("Person " + (i + 1) + " height (cm) : ");
                personData[i][1] = scanner.nextDouble();

                if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                    System.out.println("Invalid input. Weight and height must be positive.");
                    i--; // Decrement index to re-enter data
                } else {
                    validInput = true;
                }
            }

            // Calculate BMI and store in personData array index 2
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Person %d: Height=%.2fm, Weight=%.2fkg, BMI=%.2f, Status=%s\n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

    }
}
