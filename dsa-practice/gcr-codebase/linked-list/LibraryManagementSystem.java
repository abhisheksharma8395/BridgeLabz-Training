// This program is used to manage student records using a singly linked list
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Creating the object of InventoryManager class
        LibraryManager list = new LibraryManager();

        // Creating 6 Nodes
        BookNode book1 = new BookNode("The Alchemist","Paulo Coelho","Philosophical Fiction","BK001","Yes");
        BookNode book2 = new BookNode("Atomic Habits","James Clear","Self-Help","BK002","Yes");
        BookNode book3 = new BookNode("A Brief History of Time","Stephen Hawking","Science","BK003","Yes");
        BookNode book4 = new BookNode("Rich Dad Poor Dad","Robert T. Kiyosaki","Personal Finance","BK004","Yes");
        BookNode book5 = new BookNode("The Silent Patient","Alex Michaelides","Psychological Thriller","BK005","Yes");
        BookNode book6 = new BookNode("1984","George Orwell","Dystopian Fiction","BK006","Yes");

        // Connecting the Nodes
        list.addAtEnd(book1);
        list.addAtEnd(book2);
        list.addAtBeginning(book3);
        list.addAtIndex(book4, 1);
        list.addAtIndex(book5, 3);
        list.addAtBeginning(book6);

        // Searching the Book Record by using Book Title
        list.searchByBookTitle("Rich Dad Poor Dad");

        // Searching the Book by using Author Name
        list.searchByAuthorName("James Clear");

        // Displaying the details of all book records in forward direction
        list.display();

        // Deleting the record by using the roll number
        list.deleteByBookId("BK005");

        // Displaying the details of all books in BackWard Direction after deleting some records
        list.displayBackWard();



        // Display the total books in library
        list.totalBook();

    }

}

// StudentNode Class that represents what value a node store of singly linked list
class BookNode {
    String title;                                     // Stores title of book
    String author;                                    // Stores author name of book
    String genre;                                    // Stores genre of book
    String bookID;                                  // Stores the bookID of book
    String Availability;                            // Stores the Availability of the book
    BookNode next;
    BookNode prev;

    // Constructor of StudentNode class to initialize variables
    BookNode(String title , String author, String genre, String bookID, String Availability ) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.Availability = Availability;
        next = null;
        prev = null;
    }
}

class LibraryManager {
    BookNode head = null;
    BookNode tail = null;
    int size = 0;                              // Stores the  current size of linked list

    // This Method Stores the book record at the Beginning of the Linked List
    public void addAtBeginning(BookNode book) {
        book.next = head;
        head.prev = book;
        head = book;
        size++;
    }

    // This Method Stores the book record at the end of the Linked List
    public void addAtEnd(BookNode book) {
        if (head == null) {                                // If list is currently empty then we add first element in list
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
        size++;
    }


    // This Method add book Record on a specific Index
    public void addAtIndex(BookNode book, int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
        } else {
            BookNode temp = head;
            if (index == 0) {
                addAtBeginning(book);
            } else if (index == size) {
                addAtEnd(book);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                book.next = temp.next;
                temp.next.prev = book;
                book.prev = temp;
                temp.next = book;
                size++;
            }
        }
    }

    // This Method delete book record on the basis of bookID
    public void deleteByBookId(String bookID) {
        BookNode temp = head;
        if (head == null) {                                                     // Checks if the head is null or not
            System.err.println("Empty List");
        } else {                                                                 // Checks if the element at head have to delete or not
            if (head.bookID.equals(bookID)) {
                deleteAtHead();
                size--;
            } else {                                                                          // other element delete except head
                while ((temp.next != null) && !(temp.next.bookID.equals(bookID))) {
                    temp = temp.next;
                }
                if (temp.next == null) {                                                      // If user entered roll number not found in the list then this text displayed
                    System.err.println("Record not found");
                } else {                                                                     // Deleting the record who have the same bookId we want to delete
                    if (temp.next == tail) {
                        temp.prev.next = null;
                        tail = temp.prev;
                        temp.prev = null;
                    }
                    temp.next.prev = null;
                    temp.next = temp.next.next;
                    temp.next.prev.next = null;
                    temp.next.prev = temp;
                    size--;
                }
            }
        }

    }

    // This method deletes the record from the head of the list
    private void deleteAtHead() {
        try {
            head = head.next;
            head.prev = null;
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }

    // This method search for book Record by using Book title
    public void searchByBookTitle(String title) {
        BookNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Book Record found with this title . ");
        } else {
            System.out.println("Book Record found with title " + title);
            System.out.println("Book Title : " + temp.title);
            System.out.println("bookID : " + temp.bookID);
            System.out.println("Author Name : " + temp.author);
            System.out.println("Availability : " + temp.Availability);
            System.out.println("Book Genre : " + temp.genre);
            System.out.println("__________________________________________________");
        }
    }

    // This method search the book by using author name
    public void searchByAuthorName(String author) {
        BookNode temp = head;
        while (temp != null && !temp.author.equals(author)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Book Record found with this Author Name . ");
        } else {
            System.out.println("Book Record found with Author Name " + author);
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Auhtor : " + temp.author);
            System.out.println("Genre : " + temp.genre);
            System.out.println("Availablity : " + temp.Availability);
            System.out.println("__________________________________________________");
        }
    }


    // This Method display the details of all books in forward direction the inventory
    public void display() {
        BookNode temp = head;
        System.out.println("Book Record Display in Forward Direction .");
        while (temp != null) {
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Auhtor : " + temp.author);
            System.out.println("Genre : " + temp.genre);
            System.out.println("Availablity : " + temp.Availability);
            System.out.println("__________________________________________________");
            temp = temp.next;
        }
    }

    // This Method display the details of all books in forward direction the inventory
    public void displayBackWard() {
        BookNode temp = tail;
        System.out.println("Book Record Display in Backward Direction .");
        while (temp != null) {
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Auhtor : " + temp.author);
            System.out.println("Genre : " + temp.genre);
            System.out.println("Availablity : " + temp.Availability);
            System.out.println("__________________________________________________");
            temp = temp.prev;
        }
    }

    // This Method is used to count the total books in list
    public void totalBook(){
        System.out.println("Total Books in the list is "+size);
    }

}

