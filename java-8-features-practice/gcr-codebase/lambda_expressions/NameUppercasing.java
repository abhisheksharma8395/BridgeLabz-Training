package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>();
        employeeNames.add("Virat Kohli");
        employeeNames.add("Rohit Sharma");
        employeeNames.add("Mahendra Singh Dhoni");
        employeeNames.add("Abhishek Sharma");
        employeeNames.add("Jasprit Bumrah");

        employeeNames.stream().map(String :: toUpperCase).forEach(System.out::println);
    }
}
