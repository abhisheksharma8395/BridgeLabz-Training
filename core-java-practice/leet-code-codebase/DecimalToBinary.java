// This program converts the Decimal number to Binary number
import java.util.Scanner;

public class DecimalToBinary {
    // This method takes decimal number and convert that into binary number
    public static String BinaryConverter(int n) {
        // This StringBuilder stores the Binary number in string format
        StringBuilder binary = new StringBuilder();
        while(n!=1){
            binary.append(n%2);
            n/=2;
        }
        binary.append(1);
        return binary.reverse().toString();
    }
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        // Taking the input for decimal number from user
        System.out.println("Enter the Decimal Number that you want to change into binary number : ");
        int num = sc.nextInt();
        System.out.println(BinaryConverter(num));
    }
}
