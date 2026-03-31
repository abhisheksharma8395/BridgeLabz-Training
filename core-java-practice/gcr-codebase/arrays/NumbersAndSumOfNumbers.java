// This program takes input for maximum 10 number and after that prints
// the sum of all number input by user

import java.util.Scanner;

public class NumbersAndSumOfNumbers {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Array for storing 10 elements
        double[] elements = new double[10];
        double total = 0.0;                 // Stores the sum of all elements
        int index = 0;

        //runs infinite loop until user enters 0 or negative number or index become 10
        while(true){
            if(index == 10){
                break;
            }
            double entry = sc.nextDouble();
            if(entry <= 0){
                break;
            }
            elements[index++] = entry;
        }

        //Looping through array ages and prints the output
        for(int i = 0;i < 10;i++){
            System.out.print(elements[i] + " ");
            total += elements[i];
        }
        System.out.println("\n total = " + total );
    }
}
