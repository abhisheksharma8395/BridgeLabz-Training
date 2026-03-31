package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        String[] usernameArray = new String[]{"user_123","123user","us","a_123"};

        for(String userName : usernameArray){
            Matcher matcher = pattern.matcher(userName);
            System.out.println(userName+" is valid username ? : "+matcher.matches());
        }
    }
}
