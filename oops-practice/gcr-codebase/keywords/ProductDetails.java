public class ProductDetails {
   // Static variable discount shared by all products
   private static double discount = 0.0;
   // Instance variables
   private final String PRODUCT_ID;                      // Stores the product id, but it can't be changed in this program
   private String productName;                           // Stores the product name
   private double price;                                 // Stores the price of product
   private int quantity;                                 // Stores the quantity of product

   // Constructor of ProductDetails class to initialize productName, price, and quantity
   public ProductDetails(String productID, String productName, double price, int quantity) {
       this.PRODUCT_ID = productID;
       this.productName = productName;
       this.price = price;
       this.quantity = quantity;
   }
   // Static method to update the discount percentage
   public static void updateDiscount(double newDiscount) {
       if (newDiscount >= 0.0 && newDiscount <= 100.0) {
           discount = newDiscount;
       } else {
           System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
       }
   }
   // Method to calculate the price after applying the discount
   public double getDiscountedPrice() {
       return price - (price * discount / 100);
   }

   // Method to display product details
   public void displayProductDetails() {
       if (this instanceof ProductDetails) {
           System.out.println("Product ID: " + PRODUCT_ID);
           System.out.println("Product Name: " + productName);
           System.out.println("Price: $" + price);
           System.out.println("Quantity: " + quantity);
           System.out.println("Discount: " + discount + "%");
           System.out.println("Price after Discount: $" + getDiscountedPrice());
       } else {
           System.out.println("The object is not an instance of the Product class.");
       }
   }
   // Getters and setters for instance variables PRODUCT_ID , productName, price and quantity
   public String getPRODUCT_ID() {
       return PRODUCT_ID;
   }
   public String getProductName() {
       return productName;
   }
   public void setProductName(String productName) {
       this.productName = productName;
   }
   public double getPrice() {
       return price;
   }
   public void setPrice(double price) {
       this.price = price;
   }
   public int getQuantity() {
       return quantity;
   }
   public void setQuantity(int quantity) {
       this.quantity = quantity;
   }

   // Main method to test the program
   public static void main(String[] args) {
       // Update the discount for all products
       ProductDetails.updateDiscount(10.0); // 10% discount

       // Creating new ProductDetails class instances
       ProductDetails product1 = new ProductDetails("P001", "Laptop", 1200.00, 5);
       ProductDetails product2 = new ProductDetails("P002", "Smartphone", 800.00, 10);

       // Displaying product details
       product1.displayProductDetails();
       System.out.println();
       product2.displayProductDetails();
   }
}
