package exceptions;

import java.util.Scanner;

public class ExceptionPropagation{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the Amount : ");
            double amount = sc.nextDouble();
            System.out.println("Enter the rate : ");
            double rate = sc.nextDouble();
            System.out.println("Please enter the Years : ");
            int years =  sc.nextInt();
            calculateInterest(amount,rate,years);
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Input: Amount and rate must be positive");
        }
    }

    // This method is used to Handle IllegalArgumentException
    public static void calculateInterest(double amount, double rate , int years) throws IllegalArgumentException{
        if(amount < 0 || rate < 0 || years < 0){
            throw new IllegalArgumentException();
        }
        double interest = (amount * rate * years) / 100;
        System.out.printf("The interest is %.2f\n",interest);
    }
}
