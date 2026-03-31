// This program handles ArrayIndexOutOfBounds Exception by using try and catch.

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // In this method we are Handling ArrayIndexOutOfBounds Exception
    public static void handleException(char[] charArr) {
        // Handling ArrayIndexOutOfBounds Exception
        try {
            System.out.println(charArr[charArr.length+1]);      // Trying to access the index which is out of bound of array
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception handled");
            System.out.println("Trying to access the index which not exist in Array.");
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
        handleException(str.toCharArray());                      // Providing Character Array

    }
}

