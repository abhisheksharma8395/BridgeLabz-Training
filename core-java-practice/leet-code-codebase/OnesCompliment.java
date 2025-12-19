// This program Calculates the Ones Compliment of a number
import java.util.Scanner;

public class OnesCompliment {
    // This method return String which contains Binary representation of decimal number.
    public static String binary(int n) {
        StringBuilder binary = new StringBuilder();
        while(n!=1){
            binary.append(n%2);
            n/=2;
        }
        binary.append(1);
        return binary.reverse().toString();
    }

    // This method flip the bit after taking binary string of number means flip 0 -> 1 and 1 -> 0
    public static String flip(String s){
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='0'){
                result.append("1");
            }
            else if(c=='1'){
                result.append("0");
            }
        }
        return result.toString();
    }
    // This method takes string (Binary representation of a number) and convert it into decimal number
    public static int decimal(String str){
        int pow = 0;
        int total = 0;
        for (int i = str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            total = total + (ch-'0')*(int)Math.pow(2,pow);
            pow++;
        }
        return total;
    }

    // This method return Ones Compliment of decimal number
    public static int onesCompliment(int n){
        String binary = binary(n);  // convert decimal number into binary string
        String flip = flip(binary); // Flipped the bits of binary string
        return decimal(flip);    // Now we converted that flipped string into decimal number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(onesCompliment(n));
    }
}
