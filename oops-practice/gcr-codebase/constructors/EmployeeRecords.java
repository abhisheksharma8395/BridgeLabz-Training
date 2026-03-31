public class EmployeeRecords {
    // Main method
    public static void main(String[] args) {
        // Creating an Employee
        Employees e1 = new Employees(1001, "Finance");
        e1.setSalary(50000.0);
        e1.displayEmployeeDetails();

        // Creating a Manager
        Managers m1 = new Managers(2001, "IT", "Backend Team");
        m1.setSalary(75000.0);  // inherited method from Employee
        m1.displayManagerDetails();
    }
}

// Employee class
class Employees {
    public int employeeId;      //Stores id of employee
    protected String department;   //stores the department of employee
    private double salary;         // stores the salary of an employee

    // Parameterised constructor of Employee class
    public Employees(int employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    //public method to access salary of employee
    public double getSalary(){
        return this.salary;
    }

    //public method to modify salary of employee
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Display details of employee
    public void displayEmployeeDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department Name: " + department);
        System.out.println("Salary : "+getSalary());
        System.out.println("-----------------------------");
    }
}

//Subclass to demonstrate access to public and protected members
class Managers extends Employees {
    private String teamName;                    // stores the team name for manager
    // Parameterised constructor of managers class
    public Managers(int employeeId, String department,String teamName) {
        super(employeeId, department);
        this.teamName = teamName;
    }
    // Display the details of manager
    public void displayManagerDetails(){
        System.out.println("Manager Details: ");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department Name: " + department);
        System.out.println("Team Name: " + teamName);
        System.out.println("Salary : "+getSalary());
        System.out.println("-----------------------------");
    }
}
