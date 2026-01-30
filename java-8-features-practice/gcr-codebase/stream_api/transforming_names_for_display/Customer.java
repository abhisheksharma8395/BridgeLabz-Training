package stream_api.transforming_names_for_display;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public static void main(String[] args) {
        List<String> customerName = new ArrayList<>();
        customerName.add("Virat Kohli");
        customerName.add("Rohit Sharma");
        customerName.add("KL Rahul");
        customerName.add("Hardik Pandya");
        customerName.add("Ravindra Jadeja");
        customerName.add("Jasprit Bumrah");
        customerName.add("Shubman Gill");
        customerName.add("Rishabh Pant");
        customerName.add("Suryakumar Yadav");
        customerName.add("Sanju Samson");
        customerName = customerName.stream().map((String s) -> s.toUpperCase()).toList();
        customerName.forEach(System.out::println);
    }
}
