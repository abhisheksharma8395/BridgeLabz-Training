// This program handle Null Pointer Exception by using try and catch.

import java.util.Scanner;

public class NullPointer {

    // In this method we are Handling Null pointer Exception
    public static void handleException() {
        String str1 = null;                            // Storing the null value
        try {
            System.out.println(str1.length());
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception handled");
            System.out.println("Trying to access the Null String");
        }
    }


    // Main method
    public static void main(String[] args) {
        // Handling the exception
        handleException();

    }
}

