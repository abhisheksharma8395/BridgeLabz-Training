import java.util.ArrayList;
import java.util.List;

// Abstract Class WarehouseItem that is Acting as parent class
abstract class WarehouseItem {
    private String name;                                       // Stores the name of item
    private double price;                                      // Stores the price of item

    // Constructor of WarehouseItem class to Initialize the instance variables
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // This method prints the details of item
    public String getDetails() {
        return "Item: " + name + ", Price: ₹" + price;
    }
}

// Subclass Electronics class extending WarehouseItem
class Electronics extends WarehouseItem {
    // Constructor of Electronics class
    public Electronics(String name, double price) {
        // Calling Super class (WarehouseItem) Constructor
        super(name, price);
    }
}

// Subclass Groceries class extending WarehouseItem
class Groceries extends WarehouseItem {
    // Constructor of Groceries class
    public Groceries(String name, double price) {
        // Calling Super class (WarehouseItem) Constructor
        super(name, price);
    }
}

// Subclass Furniture class extending WarehouseItem
class Furniture extends WarehouseItem {
    // Constructor of Furniture class
    public Furniture(String name, double price) {
        // Calling Super class (WarehouseItem) Constructor
        super(name, price);
    }
}

// Generic Storage Class
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();                                   // Store the items of a specific type of class

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // wild card method to display all items in storage regardless of their type
    public void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}


// For Testing the program
public class SmartWarehouse {
    // Main method
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 65000));
        electronicsStorage.addItem(new Electronics("Mobile", 30000));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 1200));
        groceryStorage.addItem(new Groceries("Oil", 800));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500));
        furnitureStorage.addItem(new Furniture("Table", 5000));

        System.out.println(" Electronics:");
        electronicsStorage.displayItems(electronicsStorage.getItems());

        System.out.println("\n Groceries:");
        groceryStorage.displayItems(groceryStorage.getItems());

        System.out.println("\n Furniture:");
        furnitureStorage.displayItems(furnitureStorage.getItems());
    }
}
