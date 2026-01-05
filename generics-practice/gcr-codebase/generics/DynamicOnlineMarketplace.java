import java.util.ArrayList;
import java.util.List;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {

        // Creating products
        Books book1 = new Books("Java Programming", "James Gosling",500,"ISBN101");
        Clothing cloth1 = new Clothing("T-Shirt",800,"M","Black");
        Gadgets gadget1 = new Gadgets("Smartphone",15000,2,4.5);

        // Creating product catalogs
        Product<Category> productCatalog = new Product<>();


        // Adding items
        productCatalog.addItems(book1);
        productCatalog.addItems(cloth1);
        productCatalog.addItems(gadget1);


        // Applying discount
        Discount discount = new Discount();
        discount.applyDiscount(book1, 10);      // 10% discount
        discount.applyDiscount(cloth1, 20);     // 20% discount
        discount.applyDiscount(gadget1, 5);     // 5% discount

        // Display catalogs
        productCatalog.showCatalog();

    }
}


// Category interface
interface Category{
    public void details();                                    // Abstract method
    public void setPrice(double price);
    public double getPrice();
}

// Books class Extending Category interface
class Books implements Category{
    String bookName;                                                                  // Stores the Book Name of the Book
    String author;                                                                    // Stores the name of the author of the book
    private double price;                                                             // Stores the price of book
    String ISBN;                                                                      // Stores the isbn number of the books


    // Constructor of Book class to initialize the instance variables
    public Books(String bookName, String author, double price, String ISBN) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
    }

    // This method is used to display the details of the book
    public void details() {
        System.out.println("Books Details are : ");
        System.out.println("Book Name : " + this.bookName);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
        System.out.println("ISBN : " + this.ISBN);
    }

    // Initializing the interface methods to set the price of the product
    public void setPrice(double price) {
        this.price = price;
    }
    // Initializing the interface methods to get the price of the product
    public double getPrice() {
        return this.price;
    }
}

// Clothing class Extending Category interface
class Clothing implements Category{
    String clothingName;                                                              // Stores the name of cloth
    private double price;                                                             // Stores the price of the cloth
    String size;                                                                      // Stores the size of the cloth
    String color;                                                                     // Stores the color of the cloth

    // Constructor of Clothing class to initialize the instance variables
    public Clothing(String clothingName, double price, String size, String color) {
        this.clothingName = clothingName;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    // This method is used to display the details of the clothes
    public void details() {
        System.out.println("Clothing Details are : ");
        System.out.println("Cloth Name : " + this.clothingName);
        System.out.println("Size : " + this.size);
        System.out.println("Price : " + this.price);
        System.out.println("Color : " + this.color);
    }

    // Initializing the interface methods to set the price of the product
    public void setPrice(double price) {
        this.price = price;
    }
    // Initializing the interface methods to get the price of the product
    public double getPrice() {
        return this.price;
    }
}

// Gadgets class Extending Category interface
class Gadgets implements Category{
    String gadgetName;                                                              // Stores the name of gadget
    private double price;                                                           // Stores the price of the gadget
    int warranty;                                                                   // Stores the warranty of the gadget
    double rating;                                                                  // Stores the rating of the gadget

    // Constructor of Clothing class to initialize the instance variables
    public Gadgets(String gadgetName, double price, int warranty, double rating) {
        this.gadgetName = gadgetName;
        this.price = price;
        this.warranty = warranty;
        this.rating = rating;
    }

    // This method is used to display the details of the clothes
    public void details() {
        System.out.println("Gadget Details are : ");
        System.out.println("Gadget Name : " + this.gadgetName);
        System.out.println("Price : " + this.price);
        System.out.println("Warranty : " + this.warranty);
        System.out.println("Rating : " + this.rating);
    }

    // Initializing the interface methods to set the price of the product
    public void setPrice(double price) {
        this.price = price;
    }
    // Initializing the interface methods to get the price of the product
    public double getPrice() {
        return this.price;
    }
}


// Generic Class Product
class Product<T extends Category>{
    List<T> productCatalog;                                    // Stores the all product inside this list

    // Constructor of Product class
    public Product() {
        this.productCatalog = new ArrayList<>();
    }

    // This method os used to add the products into product catalog
    public void addItems(T item){
        productCatalog.add(item);
    }

    // This method is used to display all items inside product catalog
    public void showCatalog(){
        System.out.println("Product Catalog contains : ");
        for(T item : productCatalog){
            item.details();
        }
    }
}

// Class Discount that will apply discount on certain types of item
class Discount{
    public <T extends Category> void applyDiscount(T item,double percentage){
        double price = item.getPrice();
        double discountedPrice = price  - ((price/100) * percentage);
        item.setPrice(discountedPrice);
    }
}