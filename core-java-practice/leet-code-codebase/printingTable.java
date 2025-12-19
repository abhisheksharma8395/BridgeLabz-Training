import java.util.Scanner;

public class printingTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from users
        int num = sc.nextInt();
        int iterator = 1;
        while (iterator <= 10) {
            System.out.println(num + " x " + iterator + " = " + (num * iterator));
            iterator++;
        }
    }

}