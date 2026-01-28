package functional_interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String[] passwords = new String[]{"Aa1@abcd","Zz9!Zz9!","Abcdef1@","AA1@AAAA","aa1@aaaa","Aa@aaaaa","Aa1aaaaa","Aa1@aaa","Aa1@aaaaaaaaaaaa","Aa1^abcd","Aa1@abc d","12345678!","@@@@@@@","Aa1@Aa1@"};
        for(String password : passwords){
            SecurityUtils.passwordStrength(password);
        }
    }
}

interface SecurityUtils{
    static void passwordStrength(String pwd){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@!#$%&*])[A-Za-z0-9@!#$%&*]{8,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if(matcher.matches()) System.out.println("Password is valid");
        else{
            System.out.println("Password is invalid make sure to use uppercase lowercase digit and special characters");
        }
    }
}
