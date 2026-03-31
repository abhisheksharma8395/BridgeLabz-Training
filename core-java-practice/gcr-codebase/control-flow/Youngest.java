// This program tells who are tallest and youngest among three friends.
import java.util.Scanner;

public class Youngest {
    // Main Method
    public static void main(String[] args) {
        // Created Scanner class object for taking user input
        Scanner sc = new Scanner(System.in);

        // Taking input of age and height of Amar
        System.out.print("Enter age of Amar : ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar : ");
        int heightAmar = sc.nextInt();

        // Taking input of age and height of Akbar
        System.out.print("Enter age of Akbar : ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar : ");
        int heightAkbar = sc.nextInt();

        // Taking input of age and height of Anthony
        System.out.print("Enter age of Anthony : ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony : ");
        int heightAnthony = sc.nextInt();

        // Finding the name of youngest freind.
        String youngest;              // In this we store the name of youngest friend name.
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony)
            youngest = "Amar";
        else if (ageAkbar <= ageAnthony)
            youngest = "Akbar";
        else
            youngest = "Anthony";

        // Finding the name of tallest friend.
        String tallest;              // In this we store the name of tallest friend name.
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony)
            tallest = "Amar";
        else if (heightAkbar >= heightAnthony)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        // Printing the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // closing the scanner.
        sc.close();
    }
}