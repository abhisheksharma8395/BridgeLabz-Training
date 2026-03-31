import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input of first Number from user
        int num1 = sc.nextInt();
        // taking input of second number from user
        int num2 = sc.nextInt();
        // Variable c stores the addition of both numbers
        int num3 = num1 + num2;
        System.out.println("The Sum of " + num1 + " and " + num2 + " is Equals to " + num3);
    }

}