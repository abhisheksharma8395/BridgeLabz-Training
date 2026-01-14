package junit.testing_list_operations;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    // This Method is used to add Element in the list
    public boolean addElement(List<Integer> list, int element){
        list.add(element);
        return true;
    }

    // This Method is used to remove Element from the list
    public boolean removeElement(List<Integer> list , int element){
        if(list.isEmpty()){
            return false;
        }
        else if(list.contains(element)) {
            list.remove(Integer.valueOf(element));
            return true;
        }
        else{
            return false;
        }
    }

    // This Method is used to get size from the list
    public int getSize(List<Integer> list){
        return list.size();
    }
}
