import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlipKeyLogicalProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scanner.next();
        System.out.println("The Generated Key : ");
        System.out.println(cleanseAndInvert(string));
    }
    public static String cleanseAndInvert(String input){
        String regex = "\\w{6,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(!matcher.matches()){
            System.out.println("The Input is invalid");
            return " ";
        }
        else{
            input = input.toLowerCase();
            StringBuilder ans = new StringBuilder();
            for(char ch : input.toCharArray()){
                int ascii = ch;
                if(ascii % 2 != 0){
                    ans.append(ch);
                }
            }
            ans.reverse();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < ans.length(); i++) {
                if(i%2 == 0){
                    int ascii = ans.charAt(i);
                    char ch = (char)(ascii-32);
                    stringBuilder.append(ch);
                }
                else{
                    stringBuilder.append(ans.charAt(i));
                }
            }
            input = stringBuilder.toString();
        }
        return input;
    }
}
