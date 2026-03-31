import java.util.HashMap;
import java.util.Map;

public class KeyWithHighestValue {

    public static void main(String[] args) {
        // Creating the object of HashMap class
        HashMap<String,Integer> map = new HashMap<>();
        // Putting Key-value pair in HashMap
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);

        // Displaying the key with highest value
        System.out.println(HighestInMap(map));
    }

    // This method is used to return the key with Highest value in map
    public static String HighestInMap(Map<String, Integer> map) {
        String ansKey = "";
        Integer value = Integer.MIN_VALUE;
        for(String key : map.keySet()){
            if(map.get(key)>value){
                ansKey = key;
                value = map.get(key);
            }
        }
        return ansKey;
    }
}

