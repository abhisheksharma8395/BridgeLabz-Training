import java.util.ArrayList;
import java.util.List;

/* ---------- Abstract Base Class ---------- */
abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return "Item: " + name + ", Price: ₹" + price;
    }
}

/* ---------- Child Classes ---------- */
class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }
}

/* ---------- Generic Storage Class ---------- */
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

/* ---------- Utility Class with Wildcard ---------- */
class WarehouseUtil {

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

/* ---------- Main Class ---------- */
public class SmartWarehouse {
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
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n Groceries:");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("\n Furniture:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
