//This Programme calculates Profit and Loss percentage for given cost price and selling prices.
public class ProfitAndLoss {

    // Main Method
    public static void main(String[] args) {
        

        // Given Cost Price in INR
        int costPrice = 129;

        // Given Selling Price in INR
        int sellingPrice = 191;
        
        // Calculating profit by using the formula profit = Selling Price - Cost Price
        int profit = sellingPrice - costPrice;

        // Calculating Profit percentage
        double profitPercentage = (profit / (double)costPrice) * 100;
        
        // Printing the result if profit is greater than or equals to 0 it means there is profit otherwise there is loss
	if(profit>=0){
	    System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                         "\nThe Profit is INR " + profit + "₹ and the Profit Percentage is " + profitPercentage + "%");
	}
	else{
	    System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                         "₹\nThe Loss is INR" + profit + "₹ and the Loss Percentage is " + profitPercentage + "%");
	}
    }
}