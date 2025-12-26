public class Company {
    // Static variable companyName shared by all employees
    private static String companyName;
    private static int totalEmployees = 0;                      // Stores the total count of employees in the company
    // Instance variables
    private String name;                                        // Stores the name of employee
    private final int id;                                      // Final variable to ensure the employee ID cannot be modified
    private String designation;                                // Stores the designation of the employee

    // Constructor of Company class to initialize name, id, and designation
    public Company(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to set the company name
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Company) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("The object is not an instance of the Employee class.");
        }
    }
    // Getter Method for instance variables like name , id , designation
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDesignation() {
        return designation;
    }

    // Main method
    public static void main(String[] args) {

        // Set the company name (static variable)
        Company.setCompanyName("Tech Solutions Inc.");
        // Create object of Company class
        Company emp1 = new Company("Thamarai", 101, "Software Engineer");
        Company emp2 = new Company("Rohan", 102, "Project Manager");
        // Display total number of employees
        Company.displayTotalEmployees();
        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
