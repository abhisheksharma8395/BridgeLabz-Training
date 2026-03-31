// This program displays the employee details
class Employee {

    //non-static variables
    String name;                                           // Stores name of employee
    int id;                                               // Stores id of employee
    double salary;                                        // Stores salary of employee

    // Parameterised Constructor of Employee class
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //creating method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // Main Method
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 1, 500000);//calling constructor
        emp.displayEmployee();//calling the display method
    }

}
