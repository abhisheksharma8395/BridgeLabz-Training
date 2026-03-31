// This program takes input for string and count the letters in String without using .length() method

import java.util.Scanner;

public class LengthOfString {

    // Method to generate lowercase strings using charAt()
    public static int stringLength(String str) {


        int counter = 0;
        int iterator = 0;

        try{
            while(true){                       // Infinite loop
                str.charAt(iterator++);
                counter++;
            }
        }
        catch (StringIndexOutOfBoundsException e){
            // Catches the error
        }

        // return the string
        return counter;
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for string from user
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        // length using .charAt()
        int length = stringLength(str);



        // Displaying results
        System.out.println("Length of the String using .charAt() : " + length);

        sc.close();
    }
}

