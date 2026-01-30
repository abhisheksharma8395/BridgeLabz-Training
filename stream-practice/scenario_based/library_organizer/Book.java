package library_organizer;

// Book class
public class Book{
    String bookTitle;                               // Store the title of book
    String authorName;                              // Stores the name of author of book
    String genre;                                   // Stores the genre of Book
    String isbn;                                    // Stores the ISBN number of book
    boolean isBorrowed;                             // Stores the status that book is borrowed or not

    // Constructor of Book class to initialize variables
    public Book(String bookTitle,String authorName,String genre,String isbn,boolean isBorrowed){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.genre = genre;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    // This method is used to display the Book Details
    public void display(){
        System.out.println("Book Title : "+this.bookTitle);
        System.out.println("Author Name : "+this.authorName);
        System.out.println("ISBN : "+this.isbn);
        if(this.isBorrowed) System.out.println("Book is borrowed currently.");
        else System.out.println("Book is not borrowed currently.");
    }

}