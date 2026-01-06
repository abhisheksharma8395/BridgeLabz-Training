import java.util.*;

public class LibraryManagementSystem{
    public static void main(String[] args) throws BookNotAvailableException {

        // Creating object of books class
        Book books1 = new Book("XYZ","B101","ABC",5,false);
        Book books2 = new Book("MNO","B102","DFE",3,false);
        Book books3 = new Book("PQR","B103","GHI",6,false);
        Book books4 = new Book("TUV","B104","JKL",5,false);


        // Creating the object of student
        Student student1 = new Student("Virat","101","xyz@gmail.com");
        Student student2 = new Student("Rohit","102","abc@gmail.com");
        Student student3 = new Student("Dhoni","103","def@gmail.com");

        // creating the object of staff class
        Staff staff1 = new Staff("Bumrah","S101","mno@staff.com");

        // Creating the object of transaction class
        Transaction<FineCalculator> tr = new Transaction<>();
        tr.borrowBook(books1,student1,3);
        tr.borrowBook(books2,student2,3);
        tr.borrowBook(books3,student3,3);
        tr.borrowBook(books4,staff1,5);


        // Displaying details of transaction
        tr.details();
    }

}

// Class Book
class Book{
    String bookName;                                // Stores the book name
    String bookId;                                  // Stores the book Id
    String bookAuthor;                              // Stores the name of the Author
    int maxDayBorrow;                               // Stores for how many maximum days you can borrow the book
    boolean isBorrowed;                             // Stores about book is already Borrowed or not

    // Constructor of Book class
    public Book(String bookName, String BookId, String BookAuthor,int maxDayBorrow,boolean isBorrowed){
        this.bookName = bookName;
        this.bookId = BookId;
        this.bookAuthor = BookAuthor;
        this.maxDayBorrow = maxDayBorrow;
        this.isBorrowed = isBorrowed;
    }

    // This method is used to display the details
    public void displayDetails(){
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book Author: " + this.bookAuthor);
        System.out.println("Books Status Available: " + this.isBorrowed);
    }

}

// Interface FineCalculator
interface FineCalculator{
    public void finePerDay();
    public void displayDetails();
}

// Subclass Student Implementing FineCalculator Interface
class Student implements FineCalculator{
    String studentName;                                                // Stores the student name
    String studentId;                                                  // Stores the student id
    String studentEmail;                                               // Stores the Student Email

    // Constructor of Student class
    public Student(String studentName, String studentId,String studentEmail){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEmail = studentEmail;
    }

    //Overriding the method of interface FineCalculator
    @Override
    public void finePerDay() {
        System.out.println("Per Day fine for student is 10 rupees");                                        // 10 rupees fine for per day late submitting the book for student
    }

    // This method is used to display the details
    public void displayDetails(){
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Email: " + this.studentEmail);
    }

}


// Subclass Staff Implementing FineCalculator Interface
class Staff implements FineCalculator{
    String staffName;                                                // Stores the student name
    String staffId;                                                  // Stores the student id
    String staffEmail;                                               // Stores the Student Email

    // Constructor of Student class
    public Staff(String staffName, String staffId,String staffEmail){
        this.staffName = staffName;
        this.staffId = staffId;
        this.staffEmail = staffEmail;
    }

    //Overriding the method of interface FineCalculator
    @Override
    public void finePerDay() {
        System.out.println("Per Day fine for staff is 20 rupees");                                        // 20 rupees fine for per day late submitting the book for staff
    }

    // This method is used to display the details
    public void displayDetails(){
        System.out.println("Staff Name: " + this.staffName);
        System.out.println("Student ID: " + this.staffId);
        System.out.println("Student Email: " + this.staffEmail);
    }

}


// Member class For Depicting Subscription
class Member<T extends FineCalculator>{
    List<T> members;                                    // List of all Users who have subscription of this library

    // Constructor of Member class
    public Member(){
        members = new ArrayList<>();
    }

    // This Method is used to add the members into the list
    public void addMember(T member){
        members.add(member);
    }

    // This method is used to remove from the list
    public void removeMember(T member){
        members.remove(member);
    }

    // This method is used to display the all member who have membership
    public void displayMembers(){
        for(T member:members){
            member.displayDetails();
        }
    }

}



class Transaction<T extends FineCalculator>{
    T user;                                             // Stores the details of User
    int borrowDay;                                      // Stores for how many days user want
    Book book;
    HashMap<String,Book> books;
    HashMap<T,Book> bookBorrow;
    ArrayList<Book> bookList;

    // Constructor of Transaction class
    public Transaction(){
        books =  new HashMap<>();
        bookBorrow = new HashMap<>();
        bookList =  new ArrayList<>();
    }

    // This method is used to borrow the book
    public void borrowBook(Book book,T user, int borrowDay) throws BookNotAvailableException {
        if(book.isBorrowed){
            throw new BookNotAvailableException("Book is not available it is already borrowed .");
        }
        else{
            bookBorrow.put(user,book);
            bookList.add(book);
            books.put(book.bookId,book);
            book.isBorrowed = true;
        }
    }

    // This method is used to display the borrowed books
    public void details(){

        for(T key : bookBorrow.keySet()){
            System.out.println("____________________________________________________");
            System.out.println("User Details : ");
            key.displayDetails();
            System.out.println("Book Details : ");
            bookBorrow.get(key).displayDetails();
            System.out.println("Fine Details : ");
            key.finePerDay();
            System.out.println("____________________________________________________");

        }

    }
}


// Exception class BookNotAvailableException class
class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String s){
        super(s);
    }
}
