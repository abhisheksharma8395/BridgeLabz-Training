// This Program calculates the total amount after taking input of price of single quantity of product and total number of quantity bought

import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {

        // creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking Input for a single quantity price in INR
        System.out.print("Enter unit price (INR) : ");
        double unitPrice = scanner.nextDouble();

        //Taking Input for total quantity bought
        System.out.print("Enter quantity : ");
        int quantity = scanner.nextInt();

        // Calculating total price 
        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price of each quantity is INR %.2f\n",
                totalPrice, quantity, unitPrice);
    }
}