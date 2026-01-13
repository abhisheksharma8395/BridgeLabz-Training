package regex;

import java.util.Arrays;
import java.util.HashSet;

public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        HashSet<String> setOfRepeatedWords = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for(String word : text.split("\\s")){
            if(setOfRepeatedWords.contains(word)){
                ans.append(word);
                ans.append(", ");
            }
            setOfRepeatedWords.add(word);
        }
        ans.deleteCharAt(ans.length()-2);
        System.out.println(ans);
    }
}
