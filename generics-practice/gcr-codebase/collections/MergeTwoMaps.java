import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static void main(String[] args) {
        // Creating the objects of HashMap class
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        // Putting Key-value pair in HashMaps
        map1.put("A",1);
        map1.put("B",2);
        map2.put("B",3);
        map2.put("C",4);

        HashMap<String,Integer> mergedMap = MergerMap(map1,map2);
        // Displaying the Merged HashMap
        for(String key:mergedMap.keySet()){
            System.out.print(key+"="+mergedMap.get(key)+",");
        }
    }

    // This method is used to return the key with Highest value in map
    public static HashMap<String,Integer> MergerMap(Map<String, Integer> map1, Map<String, Integer> map2) {
        HashMap<String,Integer> map = new HashMap<>(map1);
        for(String key:map2.keySet()){
            map.put(key,map.getOrDefault(key,0)+map2.get(key));
        }
        return map;
    }
}

