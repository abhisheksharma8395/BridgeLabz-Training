import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfElements {

    public static void main(String[] args) {

        // Creating the object of list class
        List<String>list=new ArrayList<>();
        // Adding the elements in list
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        // Creating the object of Map class
        Map<String,Integer> map = frequency(list);
        System.out.print("{");
        for(String key : map.keySet()){
            System.out.print(key+"="+map.get(key)+",");
        }
        System.out.println("}");
    }

    // This method returns the map of frequency of all word in list
    public static Map<String,Integer> frequency(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for(String string : list){
            map.put(string,map.getOrDefault(string,0)+1);
        }
        return map;
    }
}

