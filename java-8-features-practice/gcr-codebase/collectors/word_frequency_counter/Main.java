package collectors.word_frequency_counter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Java streams make Java code more readable and Java streams are powerful";
        Map<String, Long> map = Arrays.asList(paragraph.split(" ")).stream().collect(Collectors.groupingBy((String word) -> word,Collectors.counting()));
        for(String key : map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }
    }
}
