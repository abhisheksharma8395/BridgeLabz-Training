import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class FindNthElementFromLast {

    public static void main(String[] args) {

        // Creating the object of list class
        LinkedList<String> list = new LinkedList<>();
        // Adding the elements in list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Displaying list
        System.out.println(list);

        // Displaying the Nth element of list
        getFromEnd(list,2);
    }

    // This method display Nth element from the end.
    public static void getFromEnd(List<String> list, int end) {
        if (end == list.size() || end < 0) {
            System.out.println("No Such Index Exists in List.");
        }
        int n = list.size() - end;
        System.out.println(list.get(n));
    }
}

