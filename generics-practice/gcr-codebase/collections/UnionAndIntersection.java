import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

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
        Set<Integer> union = union(set1, set2);
        System.out.print("Union : ");
        System.out.println(union);

        // Displaying the intersection of both the set
        Set<Integer> intersection = intersection(set1, set2);
        System.out.print("Intersection : ");
        System.out.println(intersection);
    }



    // This method return the union set of both the set
    public static Set<Integer> union(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> union = new HashSet<>();
        for(Integer item: set1){
            union.add(item);
        }
        for(Integer item: set2){
            union.add(item);
        }
        return union;
    }

    // This method return the union set of both the set
    public static Set<Integer> intersection(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> intersection = new HashSet<>();
        for(Integer item: set1){
            if(set2.contains(item)) {
                intersection.add(item);
            }
        }

        return intersection;
    }
}

