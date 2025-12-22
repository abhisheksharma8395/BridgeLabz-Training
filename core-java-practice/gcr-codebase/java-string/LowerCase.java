// This program takes input for string and convert it's all letters into UPPERCASE
// by using .toUpperCase() method and by using .charAt individual and compare strings generated from both method

import java.util.Scanner;

public class LowerCase {

    // Method to generate lowercase strings using charAt()
    public static String lowerCaseUsingCharAt(String str) {
        StringBuilder substring = new StringBuilder();                         // Stores the substring

        // Adding characters one by one in substring
        for (int iterator = 0; iterator < str.length(); iterator++) {
            int ascii = str.charAt(iterator);
            if ((ascii >= 65 && ascii <= 90)) {
                char character = str.charAt(iterator);
                char newCharacter = (char) ((int) character + 32);
                substring.append(newCharacter);
            }
            else{
                substring.append(str.charAt(iterator));
            }
        }

        // return the string
        return substring.toString();
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        // Substring using .charAt()
        String resultCharAt = lowerCaseUsingCharAt(str);

        // String using .toUpperCase() method
        String toLowerCaseResult = str.toLowerCase();

        // Displaying results
        System.out.println("String using .charAt() : " + resultCharAt);
        System.out.println("String using .toLowerCase() : " + toLowerCaseResult);

        // Check if both methods gave the same results
        if (resultCharAt.equals(toLowerCaseResult)) {
            System.out.println("Both methods returned the same substring.");
        } else {
            System.out.println("Methods returned different substring.");
        }

        sc.close();
    }
}

