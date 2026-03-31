// This program takes input for string and tells String is Anagram or not.
import java.util.Scanner;

public class AnagramString {

    // Method to create frequency array of elements in string
    public static int[] findFrequncyCharacter(String str) {
        int[] freq = new int[26];   // Stores the frequency of each letter

        // Filling the frequencies with letter in the array
        for (int iterator = 0; iterator < str.length(); iterator++) {
            int index = str.charAt(iterator) - 'a';
            freq[index]++;
        }
        return freq;
    }

    // This Method calculate is the both String are Anagram or not
    public static boolean isAnagram(String str1 , String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq1 = findFrequncyCharacter(str1);               // Character Frequency array for str1
        int[] freq2 = findFrequncyCharacter(str2);               // Character Frequency array for str2
        for (int iterator = 0; iterator < freq1.length; iterator++) {
            if (freq1[iterator] != freq2[iterator]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the first string : ");
        String str1 = sc.next();
        System.out.print("Enter the second string : ");
        String str2 = sc.next();


        boolean isAnagram = isAnagram(str1.toLowerCase() , str2.toLowerCase());
        System.out.println(str1 + " and " + str2 + " is anagram to each other? : " + isAnagram);

        sc.close();
    }
}

