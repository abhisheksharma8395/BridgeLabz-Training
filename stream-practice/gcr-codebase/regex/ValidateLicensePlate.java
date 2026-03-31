package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        String[] numberPlate = new String[]{"AB1234","A12345","VK0101","Ck2k22"};

        for(String number : numberPlate){
            Matcher matcher = pattern.matcher(number);
            System.out.println(number+" is valid License Plate Number ? : "+matcher.matches());
        }
    }
}
