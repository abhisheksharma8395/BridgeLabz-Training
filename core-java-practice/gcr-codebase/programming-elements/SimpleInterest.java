import java.util.Scanner;


class SimpleInterest {
    public static void main(String[] args) {

        // Creating the object of Scanner Class
        Scanner sc = new Scanner(System.in);

        // Taking Input of principal from user 
        System.out.println("Enter Principal:");
        double principal = sc.nextDouble();

        // Taking Input of rate from user
        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();

        // Taking Input of time in years from user
        System.out.println("Enter Time (in years):");
        double time = sc.nextDouble();

        // Calculating the interest rate by using formula interest = PRT/100
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + interest);
    }
}