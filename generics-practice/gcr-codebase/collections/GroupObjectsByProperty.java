import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupObjectsByProperty {
    public static void main(String[] args) {
        // Creating object of List class
        List<Employee> employees = new ArrayList<>();
        // Creating object of Employee class
        Employee employee1 = new Employee("Alice","HR");
        Employee employee2 = new Employee("Bob","IT");
        Employee employee3 = new Employee("Carol","HR");
        // Adding employee object in employee list
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }
    // This method groups List of employee objects by their department using a Map<Department, List<Employee>>
    public static HashMap<String,List<Employee>> GroupObjects(List<Employee> employees){
        HashMap<String,List<Employee>> map = new HashMap<>();
        for(Employee employee : employees){
            if(map.contains(employee.department))
        }

    }
}


// Employee class
class Employee{
    String name;                                            // Stores the name of the Employee
    String department;                                      // Stores the Department of the Employee

    // Constructor of Employee class to initialize variables
    public Employee(String name,String department){
        this.name=name;
        this.department=department;
    }
}
