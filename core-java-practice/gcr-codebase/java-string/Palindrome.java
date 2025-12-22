// This program takes input for string and checks is String Palindrome or not by three different methods.
import java.util.Scanner;
public class Palindrome {

    // Method to find the string is palindrome or not by using iterative way
    public static boolean palindromeIterative(String str) {
        int start = 0;                                           // Stored the start index of the String
        int end = str.length() - 1;                              // Stored the end index of the String

        // Filling the frequencies with letter in the array
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Method to find the string is palindrome or not by using recursive way
    public static boolean palindromeRecursive(String str,int start,int end) {
        if(start == end) return true;
        else if(str.charAt(start) != str.charAt(end)) return false;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Method to find the string is palindrome or not by using Character Array way
    public static boolean palindromeArray(String str) {
        char[] charArr = str.toCharArray();
        int start = 0;                                           // Stored the start index of the String
        int end = str.length() - 1;                              // Stored the end index of the String

        // Filling the frequencies with letter in the array
        while (start < end) {
            if(charArr[start] != charArr[end]) return false;
            start++;
            end--;
        }
        return true;
    }


    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the string : ");
        String str = sc.next();

        // Character and their frequency stored in this array
        boolean resultIterative = palindromeIterative(str.toLowerCase());
        boolean resultRecursive = palindromeRecursive(str.toLowerCase(),0,str.length() - 1);
        boolean resultArray = palindromeArray(str.toLowerCase());

        // Displaying results
        System.out.println("Is given String palindrome? by Iterative method : "+resultIterative);
        System.out.println("Is given String palindrome? by Recursive method : "+resultIterative);
        System.out.println("Is given String palindrome? by Character Array method : "+resultArray);

        sc.close();
    }
}

