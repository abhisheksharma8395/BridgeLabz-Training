import java.util.HashSet;
import java.util.Set;

public class TwoSetsAreEqualOrNot {

    public static void main(String[] args) {

        // Creating objects of Set class
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements in both the set
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(2);
        set2.add(1);

        //Checking if these sets are equal or not by calling the method
        setsEqual(set1, set2);
    }



    // This method checks whether the two sets are equal or not
    public static void setsEqual(Set<Integer> set1 ,  Set<Integer> set2){
        for(Integer item: set1){
            if(!set2.contains(item)){
                System.out.println("These Sets are not Equal");
                return;
            }
        }
        for(Integer item: set2){
            if(!set1.contains(item)){
                System.out.println("These Sets are not Equal");
                return;
            }
        }
        System.out.println("Both Sets are Equal.");
    }
}

