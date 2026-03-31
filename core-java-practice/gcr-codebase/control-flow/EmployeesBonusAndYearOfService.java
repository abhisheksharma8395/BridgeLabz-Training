// This program calculate Bonus And Year of Service of an Employee.
import java.util.Scanner;

public class EmployeesBonusAndYearOfService {
    // Main Method
    public static void main(String[] args) {
        // Created a Scanner class object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking Input of salary and years of service from users
        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service : ");
        int years = sc.nextInt();

        // checking if year of service i greater than 5 or not
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: ₹" + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years.");
        }

        sc.close();
    }
}