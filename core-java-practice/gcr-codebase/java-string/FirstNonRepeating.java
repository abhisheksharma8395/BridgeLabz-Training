// This program takes input for string and tells the first non-repeating character in the String .

import java.util.Scanner;

public class FirstNonRepeating {

    // Method to generate lowercase strings using charAt()
    public static char nonRepeatingChar(String str) {
        int[] freq = new int[26];   // Stores the frequency of each letter

        // Filling the frequencies with letter in the array
        for (int iterator = 0; iterator < str.length(); iterator++) {
            int index = str.charAt(iterator) - 'a';
            freq[index]++;
        }

        // Now Finding the first repeating character
        for (int iterator = 0; iterator < str.length(); iterator++) {
            if(freq[iterator] == 1){
                return ((char) (65+iterator));
            }
        }
        return '*';
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the string : ");
        String str = sc.next();

        // First character using .charAt()
        char firstNonRepeating = nonRepeatingChar(str.toLowerCase()) ;

        // Displaying results
        System.out.println("First Non Repeating Character of the String using .charAt() : " + firstNonRepeating);

        sc.close();
    }
}

