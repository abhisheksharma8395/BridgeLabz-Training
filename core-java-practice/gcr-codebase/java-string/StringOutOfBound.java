// This program handles StringIndexOutOfBound Exception by using try and catch.

import java.util.Scanner;

public class StringOutOfBound {

    // In this method we are Handling String Index Out Of Bounds Exception
    public static void handleException(String str) {
        // Handling String Out Of Bound Exception
        try {
            System.out.println(str.charAt(str.length()));      // Trying to access the index which is out of bound of string
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception handled");
            System.out.println("Trying to access the index which not exist in string");
        }
    }


    // Main method
    public static void main(String[] args) {
        // Object Of Scanner class
        Scanner sc = new Scanner(System.in);
        // Taking input of String from user
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        // Calling method to see Exception handled or not.
        handleException(str);

    }
}

