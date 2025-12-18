//This programme calculates the discounted university fee for a student based on a user input's discount.

import java.util.Scanner;
public class DiscountFeeInput {

    //Main method
    public static void main(String[] args) {
        
        // Creating the object of Scanner class
        Scanner sc = new Scanner(System.in);
       
 
        // Student's Total University Fees
        double fee = sc.nextDouble();
        
        // Discount percentage on fees
        double discountPercent = sc.nextDouble;

        // Calculating total discount 
        double discount = (fee * discountPercent) / 100;

        // Calculating the total payable fees after removing the discount money
        double finalFee = fee - discount;

        // printings the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}