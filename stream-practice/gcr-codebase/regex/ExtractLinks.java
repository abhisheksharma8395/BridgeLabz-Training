package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        String regex = "\\b(https?://)?(www\\.)?[A-Za-z0-9_]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);

        String text = "Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Matches : "+matcher.group());
        }
    }
}
