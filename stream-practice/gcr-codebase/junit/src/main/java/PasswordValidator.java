import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    // This method is used to validate the password
    public boolean isValidPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
