// This program takes input for string and tells non-repeating character in the String.
import java.util.Scanner;

public class FindUniqueCharacter {

    // Method to generate lowercase strings using charAt()
    public static char[] findUniqueCharacter(String str) {
        int[] freq = new int[26];   // Stores the frequency of each letter

        // Filling the frequencies with letter in the array
        for (int iterator = 0; iterator < str.length(); iterator++) {
            int index = str.charAt(iterator) - 'a';
            freq[index]++;
        }

        // Stores count of unique character.
        int count = 0;

        // Now Finding total number of non-repeating characters
        for (int iterator = 0; iterator < freq.length; iterator++) {
            if (freq[iterator] == 1) {
                count++;
            }
        }

        // Storing all unique characters in arrChar array
        char[] arrChar = new char[count];
        int i = 0;
        for (int iterator = 0; iterator < freq.length; iterator++) {
            if (freq[iterator] == 1) {
                arrChar[i++] = ((char) (65 + iterator));
            }
        }
        return arrChar;
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the string : ");
        String str = sc.next();

        // First character using .charAt()
        char[] uniqueChar = findUniqueCharacter(str.toLowerCase());

        // Displaying results
        System.out.println("The unique characters in the string "+str+ " are " + " : "  );
        for (int iterator = 0; iterator < uniqueChar.length; iterator++) {
            System.out.print(uniqueChar[iterator]+" ");
        }

        sc.close();
    }
}

