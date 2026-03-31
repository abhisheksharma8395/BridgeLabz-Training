// This program to save odd and even numbers into odd and even arrays between
// 1 to the number entered by the user.
import java.util.Scanner;

public class OddAndEvenNumberInArrays {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input for a number from user
        boolean flag = false;
        int number = 0;
        while (!flag) {
            System.out.println("Enter The Positive Number : ");
            number = sc.nextInt();
            if (number < 1) {
                System.out.println("Error! Invalid number please try again.");
                flag = false;
            }
            else{
                flag = true;
            }
        }

        int[] evenArray = new int[(number/2)+1];  // Stores even numbers between 1 to number
        int [] oddArray = new int[(number/2)+1];  // Stores odd numbers between 1 to number
        int indexForOdd = 0;                     // index for oddArray
        int indexForEven = 0;                    // index for evenArray

        //Looping through numbers from 1 to the number
        for(int i = 1;i <= number;i++){
            if(i % 2 == 0){
                evenArray[indexForEven++] = i;
            }
            else{
                oddArray[indexForOdd++] = i;
            }
        }

        // print the odd numbers
        for(int i = 0;i<indexForOdd;i++){
            System.out.print(oddArray[i] + " ");
        }

        //for new line
        System.out.println(" ");

        //print the even numbers
        for(int i = 0;i<indexForEven;i++){
            System.out.print(evenArray[i] + " ");
        }
    }
}
