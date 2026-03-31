import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseTheList{
    public static void main(String[] args){

        // Creating the object of ArrayList class
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Display the ArrayList
        System.out.println("Original ArrayList : ");
        display(list);

        // Display the Reversed ArrayList
        System.out.println("Reverse ArrayList : ");
        display(reverse(list));

        // Creating the object of LinkedList class
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);

        // Display the LinkedList
        System.out.println("Original LinkedList : ");
        display(linkedList);

        // Display the Reversed LinkedList
        System.out.println("Reverse LinkedList : ");
        display(reverse(linkedList));
    }

    // This Method Reverse a ArrayList
    public static <T extends Number> ArrayList<T> reverse(ArrayList<T> list){
        for(int i = 0 ; i<list.size()/2 ;i++){
            T item = list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i, item);
        }
        return list;
    }

    // This method is used to display the list
    public static <T> void display(List<T> list) {
        System.out.println(list);
    }


    // This Method Reverse a LinkedList
    public static <T extends Number> LinkedList<T> reverse(LinkedList<T> list){
        LinkedList<T> result = new LinkedList<>();
        for(T item: list){
            result.addFirst(item);
        }
        return result;
    }
}