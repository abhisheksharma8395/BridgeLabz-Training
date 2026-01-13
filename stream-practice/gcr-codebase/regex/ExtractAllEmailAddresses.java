package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddresses {
    public static void main(String[] args) {
        String regex = "\\b[A-Za-z0-9+_.-]+@[A-Za-z0-9_]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);

        String text = "Contact us at support@example.com and info@company.org";
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Matches : "+matcher.group());
        }
    }
}
