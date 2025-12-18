//This programme calculates the discounted university fee for a student based on a fixed 10% discount.
public class DiscountFee {

    //Main method
    public static void main(String[] args) {
        
        // Student's Total University Fees
        double fee = 125000;
        
        // Discount percentage on fees
        double discountPercent = 10;

        // Calculating total discount 
        double discount = (fee * discountPercent) / 100;

        // Calculating the total payable fees after removing the discount money
        double finalFee = fee - discount;

        // printings the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}