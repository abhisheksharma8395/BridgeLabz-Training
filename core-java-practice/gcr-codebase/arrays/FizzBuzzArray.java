// This program  take a number as user input and if it is a positive integer loop
// from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead
// of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz"

import java.util.Scanner;

public class FizzBuzzArray {
    // Main method
    public static void main(String[] args) {
        // Object Of Scanner class
        Scanner sc = new Scanner(System.in);
        // Taking input from user for a number
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        // This array stores the result
        String[] array = new String[number+1];


        //Looping through array
        for(int iterator = 1;iterator < array.length;iterator++){
            // if element is divisible by 3 and 5 both then storing FizzBuzz in array
            if(iterator%3 == 0 &&  iterator%5 == 0){
                array[iterator] = "FizzBuzz";
            }
            else if(iterator%3 == 0){
                array[iterator] = "Fizz";
            }
            else if(iterator%5 == 0){
                array[iterator] = "Buzz";
            }
            else{
                array[iterator] = String.valueOf(iterator);
            }
        }

        //print the Result
        for(int i = 1;i < array.length;i++){
            System.out.println("Position "+i+" = "+array[i]);
        }

    }
}
