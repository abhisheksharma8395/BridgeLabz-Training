package scenario_based.library_organizer;

// Main class to test the all classes
public class Main {
    public static void main(String[] args) {
        // Creating the objects of Book class
        Book book1  = new Book("The Alchemist", "Paulo Coelho", "Fiction", "9780061122415", false);
        Book book2  = new Book("1984", "George Orwell", "Dystopian", "9780451524935", false);
        Book book3  = new Book("To Kill a Mockingbird", "Harper Lee", "Classic", "9780060935467", false);
        Book book4  = new Book("Pride and Prejudice", "Jane Austen", "Romance", "9781503290563", true);
        Book book5  = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", "9780743273565", true);
        Book book6  = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "9780547928227", false);
        Book book7  = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy", "9780747532699", true);
        Book book8  = new Book("The Catcher in the Rye", "J.D. Salinger", "Classic", "9780316769488", false);
        Book book9  = new Book("The Da Vinci Code", "Dan Brown", "Thriller", "9780307474278", false);
        Book book10 = new Book("The Kite Runner", "Khaled Hosseini", "Drama", "9781594631931", true);


        // Creating the object of LibraryOrganizer class
        LibraryOrganizer libraryOrganizer = new LibraryOrganizer();

        // Adding the book by using addBook method of LibraryOrganizer class
        libraryOrganizer.addBook(book1);
        libraryOrganizer.addBook(book2);
        libraryOrganizer.addBook(book3);
        libraryOrganizer.addBook(book4);
        libraryOrganizer.addBook(book5);
        libraryOrganizer.addBook(book6);
        libraryOrganizer.addBook(book7);
        libraryOrganizer.addBook(book8);
        libraryOrganizer.addBook(book9);
        libraryOrganizer.addBook(book10);

        // Displaying the books before removing the book
        libraryOrganizer.display();

        // Removing the book
        libraryOrganizer.removeBook(book7);
        // changing the borrowed status of book
        libraryOrganizer.setBorrowStatus(book5,false);

        // Displaying the books after removing the book
        libraryOrganizer.display();

    }
}
