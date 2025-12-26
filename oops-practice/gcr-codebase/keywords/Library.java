class BooksDetails {
   private static String libraryName;                                // Static variable LibraryName shared across all instances
   // Instance variables
   private String title;                                             // Stores the title of book
   private String author;                                            // Stores the name of the author
   private final String ISBN;                                        // Stores the isbn number of the book which can't be changed in the program

   // Constructor of Class BooksDetails to initialize instance variables
   public BooksDetails(String title, String author, String isbn) {
       this.title = title;
       this.author = author;
       this.ISBN = isbn;
   }

   // Static getter and setter method to set the library name
   public static void setLibraryName(String name) {
       libraryName = name;
   }
   public static void displayLibraryName() {
       System.out.println("Library Name: " + libraryName);
   }

   // Method to display book details
   public void displayBookDetails() {
       if (this instanceof BooksDetails) {
           System.out.println("Title: " + title);
           System.out.println("Author: " + author);
           System.out.println("ISBN: " + ISBN);
       } else {
           System.out.println("The object is not an instance of the Book class.");
       }
   }
   // Getter methods for instance variables like title , author and isbn
   public String getTitle() {
       return title;
   }
   public String getAuthor() {
       return author;
   }
   public String getISBN() {
       return ISBN;
   }
}
public class Library {
   public static void main(String[] args) {
       // Set the library name (static variable)
       BooksDetails.setLibraryName("Egmore Library");
       // Display the library name
       BooksDetails.displayLibraryName();
       // Create a new book instance
       BooksDetails book1 = new BooksDetails("Effective Java", "Joshua Bloch", "978-0134685991");
       // Display book details
       book1.displayBookDetails();
   }
}
