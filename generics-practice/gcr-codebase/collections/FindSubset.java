import java.util.HashSet;
import java.util.Set;

public class FindSubset {

    public static void main(String[] args) {

        // Creating objects of Set class
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements in both the set
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        //Checking if these sets are equal or not by calling the method
        System.out.print("Set1 is subset of Set2 ? : ");
        System.out.println(subset(set1, set2));
    }



    // This method checks whether the two sets are equal or not
    public static boolean subset(Set<Integer> set1 ,  Set<Integer> set2){
        for(Integer item: set1){
            if(!set2.contains(item)){
                return false;
            }
        }
        return true;
    }
}

