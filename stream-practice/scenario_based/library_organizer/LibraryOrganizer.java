package scenario_based.library_organizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LibraryOrganizer {
    // This map stores the list of books according to genre
    HashMap<String, LinkedList<Book>> map = new HashMap<>();

    // This method is used to add the book in map based on genre
    public void addBook(Book book){
        // Checking if genre is already present in the map or not
        if(this.map.containsKey(book.genre)){
            this.map.get(book.genre).add(book);
        }
        // if genre is not present in map
        else{
            this.map.put(book.genre, new LinkedList<>());
            this.map.get(book.genre).add(book);
        }
        System.out.println("Book name "+book.bookTitle+" with genre "+book.genre+" added Successfully.");
    }

    // This method is used to remove the book in map based on genre
    public void removeBook(Book book){
        System.out.println("==============================================================");
        // Checking if genre is already present in the map or not
        if(map.containsKey(book.genre)){
            if(map.get(book.genre).contains(book)){
                map.get(book.genre).remove(book);
                System.out.println("Book name "+book.bookTitle+" with genre "+book.genre+" removed Successfully.");
            }
            else{
                System.out.println("Book name "+book.bookTitle+" with genre "+book.genre+" not founded .");
            }
        }
        // if genre is not present in map
        else{
            System.out.println("Book name "+book.bookTitle+" with genre "+book.genre+" not founded .");
        }
        System.out.println("==============================================================");
    }

    // This method is used to change the book's isBorrowed or not
    public void setBorrowStatus(Book book,boolean status){
        System.out.println("==============================================================");
        // Checking if genre is already present in the map or not
        if(map.containsKey(book.genre)){
            if(map.get(book.genre).contains(book)){
                book.isBorrowed = status;
                if(status) System.out.println("Changed the Status to \"Borrowed\" of Book title "+book.bookTitle+" with genre "+book.genre);
                else System.out.println("Changed the Status to \"Not Borrowed\" of Book title "+book.bookTitle+" with genre "+book.genre);
            }
            else{
                System.out.println("Book name "+book.bookTitle+" with genre "+book.genre+" not founded .");
            }
        }
        // if genre is not present in map
        else{
            System.out.println("Book name "+book.bookTitle+" with genre "+book.genre+" not founded .");
        }
        System.out.println("==============================================================");
    }

    // This method is used to display the books in the map
    public void display(){
        System.out.println("------------------ All Books Details ----------------");
        for(String genre : map.keySet()){
            System.out.println("------------------ "+genre+" ----------------");
            for(Book book : map.get(genre)){
                System.out.println("------------------ Book Details ----------------");
                book.display();
            }
        }
    }
}



