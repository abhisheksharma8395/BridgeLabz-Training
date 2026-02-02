package collectors.order_revenue_summary;

public class Order {
    String customerName;                                                         // Stores the customer Name
    double totalCost;                                                            // Stores the total cost

    // Constructor of Order class to initialize the instance variable
    public Order(String customerName, double totalCost){
        this.customerName = customerName;
        this.totalCost = totalCost;
    }
}
