// Reservable Interface
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract Class LibraryItem
abstract class LibraryItem {
    private String itemId;                              // Stores the itemId of book
    private String title;                               // Stores the title of title
    private String author;                              // Stores the author of author
    private String borrower;                            // Stores the borrower name of book
    private boolean isReserved;                         // Stores the isReserved or not

    // Constructor of LibraryItem class
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
        this.isReserved = false;
    }

    // Abstract method getLoanDuration tells about
    public abstract int getLoanDuration(); // in days

    // Displays the getItemDetails
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Reserved: " + (isReserved ? "Yes" : "No"));
        if (borrower != null) {
            System.out.println("Borrower: " + borrower);
        }
    }

    // Getter and Setter method for Borrower and isReserved to perform encapsulation
    public String getBorrower() {
        return borrower;
    }
    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    protected boolean isReserved() {
        return isReserved;
    }
    protected void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }
}

// BooksInfo subclass of LibraryItem and also implements Reservable
class BooksInfo extends LibraryItem implements Reservable {
    // Constructor of BooksInfo
    public BooksInfo(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Method to get Loan Duration
    public int getLoanDuration() {
        return 14;                                                   // 14 days
    }

    // This method is used to reserve book
    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            return true;
        }
        return false;
    }

    // This method check is book available for borrow or not
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Magazine extend the class LibraryItem and implementing Reservable interface
class Magazine extends LibraryItem implements Reservable {
    // Constructor of Magazine class
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Displays for how many days you can borrow Magazine
    public int getLoanDuration() {
        return 7; // 7 days
    }

    // This method is used to reserve the Magazine
    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            return true;
        }
        return false;
    }

    // This method check is Magazine available for borrow or not
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// DVD extending LibraryItems class and also implementing Reservable interface
class DVD extends LibraryItem implements Reservable {

    // Constructor of DVD class
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Displays for how many days you can borrow DVD
    public int getLoanDuration() {
        return 5; // 5 days
    }

    // This method is used to reserve the Magazine
    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            return true;
        }
        return false;
    }

    // This method check is DVD available for borrow or not
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main Class to test the program
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating the array of class LibraryIItems
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new BooksInfo("B001", "Wings of Fire", "A.P.J. Abdul Kalam");
        items[1] = new Magazine("M001", "National Geographic", "Various");
        items[2] = new DVD("D001", "Interstellar", "Christopher Nolan");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Polymorphic use of Reservable
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.checkAvailability()) {
                    r.reserveItem("Abhishek Sharma");
                    System.out.println("Item reserved successfully.");
                } else {
                    System.out.println("Item already reserved.");
                }
            }
            System.out.println("--------------------------------------------------");
        }
    }
}
