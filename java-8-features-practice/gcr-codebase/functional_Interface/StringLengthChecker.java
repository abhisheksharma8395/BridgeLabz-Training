package functional_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String message = scanner.nextLine();
        System.out.println("Enter the Character limit : ");
        int limit = scanner.nextInt();
        Function<String,Integer> sizeOfString = (String string) -> string.length();
        if(sizeOfString.apply(message) > limit){
            System.out.println("Alert : Message crossed the limit");
        }
        else{
            System.out.println("Message does not crossed the limit");
        }
    }
}
