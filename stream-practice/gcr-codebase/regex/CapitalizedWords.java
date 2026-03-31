package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static void main(String[] args) {
        String regex = "\\b[A-Z]{1}[A-Za-z]*\\b";
        Pattern pattern = Pattern.compile(regex);

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.print(matcher.group()+", ");
        }
    }
}
