import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {

        // Creating objects of Set class
        Set<Integer> set1 = new HashSet<>();

        // Adding elements in the set
        set1.add(5);
        set1.add(3);
        set1.add(9);
        set1.add(1);

        //Checking if these sets are equal or not by calling the method
        System.out.println(setToOrderedList(set1));
    }

    // This method convert the set into a sorted list in ascending order
    public static List<Integer> setToOrderedList(Set<Integer> set1){
        List list = new ArrayList();
        for(Integer item: set1){
            list.add(item);
        }
        Collections.sort(list);
        return list;
    }
}

