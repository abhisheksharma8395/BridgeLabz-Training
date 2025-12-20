// This program takes input for 10 person ages and tells who can vote or not.
import java.util.Scanner;

public class VoteEligibility {
    // Main Method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Array for storing 10 persons age
        int[] age = new int[10];

        //Taking input for 10 person ages into age array
        for(int i = 0; i < 10; i++){
            System.out.println("Enter age for "+(i+1)+"th Student : ");
            age[i] = sc.nextInt();
        }

        //Looping through array age and printing the output
        for(int i = 0;i < age.length;i++){
            if(age[i] < 0){
                System.out.println("An Invalid age!");
            }
            else if(age[i] >= 18){
                System.out.println("The student with the age "+age[i]+" can vote");
            }
            else{
                System.out.println("The student with the age "+age[i]+" cannot vote");
            }
        }

    }
}