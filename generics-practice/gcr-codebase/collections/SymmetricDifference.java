import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static void main(String[] args) {

        // Creating objects of Set class
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements in both the set
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Displaying the union of both the set
        Set<Integer> setDifference = setDifference(set1, set2);
        System.out.println(setDifference);

    }



    // This method finds the symmetric difference (elements present in either set but not in both) of two sets
    public static Set<Integer> setDifference(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> setDifference = new HashSet<>();
        for(Integer item: set1){
            if(!set2.contains(item)) {
                setDifference.add(item);
            }
        }
        for(Integer item: set2){
            if(!set1.contains(item)) {
                setDifference.add(item);
            }
        }
        return setDifference;
    }

}

