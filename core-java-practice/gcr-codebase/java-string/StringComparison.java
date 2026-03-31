// This program takes input for two string and compare by using .equals method and by using
// individually checking each letter of string.
import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are different, they are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // All characters matched
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // taking input for two strings from user
        System.out.print("Enter first string : ");
        String str1 = sc.next();
        System.out.print("Enter second string : ");
        String str2 = sc.next();

        // Comparing using charAt()
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Comparing using equals() method
        boolean resultEquals = str1.equals(str2);

        // Displaying results
        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        // Check if both methods gave the same results
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println("Methods returned different results.");
        }

        sc.close();
    }
}

