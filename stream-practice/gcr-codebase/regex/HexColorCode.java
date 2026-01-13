package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        String regex = "^#[A-Fa-f0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);

        String[] hexCodes = new String[]{"#FFA500","#ff4500","#123","K10100"};

        for(String code : hexCodes){
            Matcher matcher = pattern.matcher(code);
            System.out.println(code+" is valid Hex Color Codes ? : "+matcher.matches());
        }
    }
}
