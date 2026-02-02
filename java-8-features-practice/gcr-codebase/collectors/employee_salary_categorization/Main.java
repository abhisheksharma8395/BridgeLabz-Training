package collectors.employee_salary_categorization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1  = new Employee("Abhishek Sharma", "Human Resource", 56500);
        Employee employee2  = new Employee("Rohit Verma", "Finance", 58000);
        Employee employee3  = new Employee("Neha Gupta", "IT", 62000);
        Employee employee4  = new Employee("Ankit Singh", "Marketing", 54000);
        Employee employee5  = new Employee("Pooja Mehta", "Sales", 55000);
        Employee employee6  = new Employee("Amit Kumar", "Operations", 60000);
        Employee employee7  = new Employee("Sneha Kapoor", "Admin", 50000);
        Employee employee8  = new Employee("Vikas Malhotra", "IT", 65000);
        Employee employee9  = new Employee("Ritu Jain", "Finance", 59000);
        Employee employee10 = new Employee("Karan Patel", "Human Resource", 57000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);

        Map<String,Double> map = employeeList.stream()
                .collect(Collectors.groupingBy((Employee :: getDeptName),Collectors.averagingDouble(Employee ::getSalary)));
        for(String key : map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }

    }
}
