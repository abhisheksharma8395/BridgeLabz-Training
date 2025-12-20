// This program takes the input for a number and store
// factors of that number into array.
import java.util.Scanner;
public class FactorsOfANumber {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input for a number
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding the factor and store into array
        for(int iterator = 1;iterator < number;iterator++){
            if(number % iterator == 0){
                // if array get fully filled increasing the size of array to store more elements
                if(index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = iterator;
                index++;
            }
        }
        // print the factors
        for(int i = 0;i<index;i++){
            System.out.print(factors[i] + " ");
        }
    }
}
