// This program takes input for string and start and end index and generate substring
// by using .substring method and by using .charAt individual addition and compare strings generated from both method
import java.util.Scanner;

public class SubString {

    // Method to generate substrings using charAt()
    public static String subStringUsingCharAt(int start,int end,String str) {
        StringBuilder substring = new StringBuilder();                         // Stores the substring

        // Adding characters one by one in substring
        for (int iterator = start; iterator <= end; iterator++) {
            substring.append(str.charAt(iterator));
        }

        // return the substring
        return substring.toString();
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // taking input for string and start and end index from user
        System.out.print("Enter the string : ");
        String str = sc.next();
        System.out.println("Enter the start index : ");
        int start = sc.nextInt();
        System.out.print("Enter the end index : ");
        int end = sc.nextInt();

        // Validating input for index
        if((start<0) || (end>=str.length()) || (start > end)){
            System.out.println("Invalid index input.") ;
            return;
        }

        // Substring using charAt()
        String resultCharAt = subStringUsingCharAt(start,end,str);

        // Comparing using equals() method
        String substringMethod = str.substring(start,end+1);

        // Displaying results
        System.out.println("Substring using .charAt() : " + resultCharAt);
        System.out.println("Substring using .substring() : " + substringMethod);

        // Check if both methods gave the same results
        if (resultCharAt.equals(substringMethod)) {
            System.out.println("Both methods returned the same substring.");
        } else {
            System.out.println("Methods returned different substring.");
        }

        sc.close();
    }
}

