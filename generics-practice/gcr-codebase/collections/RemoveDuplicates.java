import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Creating the object of list class
        List<Integer>list=new ArrayList<>();
        // Adding the elements in list
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        // Displaying list before any operations
        System.out.println(list);

        list = removeDuplicates(list);
        // Displaying list after removing duplicates
        System.out.println(list);

    }

    // This method returns the list after removing the duplicates
    public static List<Integer> removeDuplicates(List<Integer> list){
        // Creating the object of Set class
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        // traversing in list
        for(Integer item: list){
            if(!set.contains(item)){
                result.add(item);
                set.add(item);
            }
        }
        return result;
    }
}

