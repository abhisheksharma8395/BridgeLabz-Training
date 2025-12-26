// Discountable Interface
interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

// Abstract FoodItem class
abstract class FoodItem {
    private String itemName;                          // Stores the food item name
    private double price;                             // Stores the price of food item
    private int quantity;                             // Stores the quantity of food item

    // Constructor of FoodItem abstract class
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method to display the item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Getter and Setter method for ItemName and Price and Quantity to perform encapsulation
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    protected void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// VegItem class extending the FoodItem class and also implementing the Discountable interface
class VegItem extends FoodItem implements Discountable {
    // Constructor of VegItem class
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculating the total Quantity
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No additional charge
    }

    // This method is used to apply Discount .
    public void applyDiscount() {
        double discount = getPrice() * 10 / 100;
        setPrice(getPrice() - discount);                     // Set the new price after discount.
    }

    // This method tells about how much discount you get on Veg Items.
    public String getDiscountDetails() {
        return "Veg item eligible for up to 10% discount.";
    }
}

// NonVegItem class extending the FoodItem and also implementing the Discountable interface.
class NonVegItem extends FoodItem implements Discountable {
    // Constructor of NonVegItem class
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // This method is used to calculate the total price
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        return baseTotal;
    }

    // This method is used to apply Discount .
    public void applyDiscount() {
        double discount = getPrice() * 5 / 100;
        setPrice(getPrice() - discount);
    }

    // This method tells about how much discount you get on Veg Items.
    public String getDiscountDetails() {
        return "Non-Veg item eligible for up to 5% discount.";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating the array of FoodItem class
        FoodItem[] items = new FoodItem[2];

        items[0] = new VegItem("Paneer Butter Masala", 180, 2);
        items[1] = new NonVegItem("Chicken Biryani", 250, 2);

        for (FoodItem item : items) {
            item.getItemDetails();

            // Apply discount
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                d.applyDiscount();
            }

            double total = item.calculateTotalPrice();
            System.out.println("Total Price (after discount & charges): ₹" + total);
            System.out.println("--------------------------------------");
        }
    }
}
