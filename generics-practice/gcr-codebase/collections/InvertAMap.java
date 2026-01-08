import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InvertAMap {
    public static void main(String[] args) {
        // Creating object of HashMap class
        HashMap<String,Integer> map = new HashMap<>();

        // Adding employee object in employee list
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);

        //
        HashMap<Integer,List<String>> ansMap = invertMap(map);
        for(Integer key : ansMap.keySet()){
            System.out.print(key+"=");
            System.out.print("[");
            for(int i = 0; i < ansMap.get(key).size(); i++) {
                System.out.print(ansMap.get(key).get(i));
                if(i != ansMap.get(key).size()-1) System.out.print(",");
            }
            System.out.print("], ");
        }
    }


    // This method groups List of employee objects by their department using a Map<Department, List<Employee>>
    public static HashMap<Integer,List<String>> invertMap(HashMap<String,Integer> map){
        HashMap<Integer,List<String>> ansMap = new HashMap<>();
        for(String str : map.keySet()){
            if(ansMap.containsKey(map.get(str))){
                ansMap.get(map.get(str)).add(str);
            }
            else{
                ansMap.put(map.get(str),new ArrayList<>());
                ansMap.get(map.get(str)).add(str);
            }
        }
        return ansMap;
    }
}

