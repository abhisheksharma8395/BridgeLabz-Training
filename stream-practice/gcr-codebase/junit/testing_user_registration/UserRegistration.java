package junit.testing_user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String userName;                                    // Stores the username of user
    String email;                                       // Stores the email of user
    String password;                                    // Stores the password of user

    // This method is used to register User
    public boolean registerUser(String username,String email,String password) throws IllegalArgumentException {
        if(isValid(username,email,password)){
            this.userName = username;
            this.email = email;
            this.password = password;
            return true;
        }
        else{
            throw new IllegalArgumentException("Please Enter Valid Details");
        }

    }

    // This method is used to validate the inputs
    public static boolean isValid(String username,String email,String password){
        String regexForUsername = "^[A-Za-z0-9_]{3,}$";
        String regexForEmail = "^[A-Za-z0-9+-._-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}$";
        String regexForPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#$%@&!])[A-Za-z0-9#$@%&!]{8,15}";

        // Creating Pattern class object
        Pattern pattern1 = Pattern.compile(regexForUsername);
        Pattern pattern2 = Pattern.compile(regexForEmail);
        Pattern pattern3 = Pattern.compile(regexForPassword);

        // Creating object of Matcher class
        Matcher matcher1 = pattern1.matcher(username);
        Matcher matcher2 = pattern2.matcher(email);
        Matcher matcher3 = pattern3.matcher(password);

        return matcher1.matches() && matcher2.matches() && matcher3.matches();
    }
}
