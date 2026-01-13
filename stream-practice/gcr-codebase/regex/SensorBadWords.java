package regex;

import java.util.Arrays;
import java.util.HashSet;

public class SensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        HashSet<String> setOfBadWords = new HashSet<>(Arrays.asList("damn","stupid"));
        StringBuilder ans = new StringBuilder();
        for(String word : text.split("\\s")){
            if(setOfBadWords.contains(word.toLowerCase())){
                ans.append("****");
                ans.append(" ");
            }
            else{
                ans.append(word);
                ans.append(" ");
            }
        }
        System.out.println(ans);
    }
}
