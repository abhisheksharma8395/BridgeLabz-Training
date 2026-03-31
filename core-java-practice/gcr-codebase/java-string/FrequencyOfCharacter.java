// This program takes input for string and tells the frequencies of all Characters in the String .

import java.util.Scanner;
public class FrequencyOfCharacter {

    // Method to generate lowercase strings using charAt()
    public static String[][] frequencyOfCharacter(String str) {

        int[] freq = new int[26];   // Stores the frequency of each letter

        // Filling the frequencies with letter in the array
        for (int iterator = 0; iterator < str.length(); iterator++) {
            int index = str.charAt(iterator) - 'a';
            freq[index]++;
        }

        // Now Storing the character and its respecting frequency in String.
        String[][] charFreq = new String[26][2];
        for (int iterator = 0; iterator < 26; iterator++) {
            charFreq[iterator][0] = String.valueOf((char) (65 + iterator));
            charFreq[iterator][1] = String.valueOf(freq[iterator]);
        }
        return charFreq;
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the string : ");
        String str = sc.next();

        // Character and their frequency stored in this array
        String[][] frequencies = frequencyOfCharacter(str.toLowerCase());

        // Displaying results
        System.out.println("Frequency of All Character : ");
        for (int i = 0; i < frequencies.length; i++) {
            if(frequencies[i][1].equals("0")) continue;
            System.out.println(" The Frequency of Character " + frequencies[i][0]+" in String "+str+" is equals to "+frequencies[i][1]);
        }

        sc.close();
    }
}

