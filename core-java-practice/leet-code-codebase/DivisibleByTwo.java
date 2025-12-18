import java.util.*;

public class DivisibleByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input of a number from user
        int num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println("The Number " + num + " is divisible by 2");
        } else {
            System.out.println("The Number " + num + " is not divisible by 2");
        }
    }

}
