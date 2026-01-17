package annotation;

import java.util.ArrayList;

public class SuppressWarningAnnotation {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();          // ArrayList without using thee Generics
        list.add("Abhishek");
        list.add("Sharma");
        list.add(18);
        list.add(3.14);
        System.out.println(list);
    }
}
