
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCards {
    public static void main(String[] args) {
        String regex = "^(4\\d{15}|5\\d{15})$";
        Pattern pattern = Pattern.compile(regex);

        String[] cards = {"4123456789012345","5123456789012345" , "41234567890123" , "6123456789012345"};
                            //Visa                // MasterCard      // 14 number only    // starting with 6
        for (String card : cards) {
            Matcher matcher = pattern.matcher(card);
            System.out.println(card + " is valid? : " + matcher.matches());
        }
    }
}
