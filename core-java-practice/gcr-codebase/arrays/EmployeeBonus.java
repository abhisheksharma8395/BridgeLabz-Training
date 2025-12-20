// This program calculates the bonus of employees on the basis of their year of service.
import java.util.Scanner;
public class EmployeeBonus {
    // Main method
    public static void main(String[] args) {
        // Object Of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Arrays to store employee data
        double[] salaries = new double[10];          // Stores Salaries of employees
        int[] yearsOfService = new int[10];          // Stores Year of service of employees
        double[] bonuses = new double[10];           // Stores Bonuses of employees
        double[] newSalaries = new double[10];       // Stores new salaries of employee after adding bonuses

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Taking Input for employee data
        System.out.println("Enter details for 10 employees:");
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nEmployee " + (i + 1) + " salary : ");
                salaries[i] = scanner.nextDouble();
                System.out.print("Employee " + (i + 1) + " years of service : ");
                yearsOfService[i] = scanner.nextInt();

                // Validating input of user for both salaries and year of service
                if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Please enter positive values.");
                    i--; // Decrement index to re-enter data
                } else {
                    validInput = true;
                }
            }
            // Calculating the total salaries before giving bonus to employees
            totalOldSalary += salaries[i];
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];
            // Calculating total bonus given to employees
            totalBonus += bonuses[i];
            // Calculating total of new salaries after adding bonus
            totalNewSalary += newSalaries[i];
        }

        // Printing the results
        System.out.println("\nBonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary=%.2f, Bonus=%.2f, New Salary=%.2f\n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

    }
}
