import java.util.ArrayList;
import java.util.List;


public class RotateElementInList {

    public static void main(String[] args) {

        // Creating the object of list class
        List<Integer>list=new ArrayList<>();
        // Adding the elements in list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Displaying list before rotation
        System.out.println(list);

        // Rotating the list by 2 postition
        rotate(list,2);
        // Displaying list after rotation
        System.out.println(list);
    }

    // This method rotates the list by n position
    public static void rotate(List<Integer> list,int n){
        n = n%list.size();
        reverse(list,0,list.size()-1);
        reverse(list,0,list.size()-1-n);
        reverse(list,list.size()-1-n+1,list.size()-1);
    }


    // This method reverse the list from given start index to given end index
    public static void reverse(List<Integer> list,int start,int end){
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}

