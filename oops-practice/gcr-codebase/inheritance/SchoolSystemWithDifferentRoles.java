// PersonDetails Class Acting as the Superclass
class PersonDetails {
    protected String name;                                 // Stores the name of person
    protected int age;                                     // Stores the age of person

    // Constructor of PersonDetails class
    public PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Displaying the information of person 
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Teacher class is a subclass of PersonDetails
class Teacher extends PersonDetails {
    private String subject;                                    // Stores the subject whose teacher taught

    // Constructor of PersonDetails class
    public Teacher(String name, int age, String subject) {
        super(name, age);                            // Calling the Super class(PersonDetails) constructor
        this.subject = subject;
    }

   // Displaying the role of Teacher 
    public void displayRole() {
        System.out.println("\n--- Teacher Role ---");
        displayInfo();
        System.out.println("Subject : " + subject);
    }
}

// Student class is a subclass of PersonDetails
class StudentDetails extends PersonDetails {
    private String grade;                                             // Stores the grade of student

    // Constructor of StudentDetails class
    public StudentDetails(String name, int age, String grade) {
        super(name, age);                                              // Calling the Super class(PersonDetails) constructor
        this.grade = grade;
    }

   // Displaying the role of Teacher
    public void displayRole() {
        System.out.println("\n--- Student Role ---");
        displayInfo();
        System.out.println("Grade : " + grade);
    }
}

// Staff class is a subclass of PersonDetails
class Staff extends PersonDetails {
    private String department;                                        // Stores the Department of staff

    // Constructor of Staff class
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    // Displaying the role of Staff
    public void displayRole() {
        System.out.println("\n--- Staff Role ---");
        displayInfo();
        System.out.println("Department : " + department);
    }
}

// Main class to run the program
public class SchoolSystemWithDifferentRoles {
    public static void main(String[] args) {
    	
    	// Creating the object of teacher , student and staff
        Teacher teacher = new Teacher("Kaushal Kumar", 45, "Mathematics");
        StudentDetails student = new StudentDetails("Abhishek Sharma", 20, "12th Grade");
        Staff staff = new Staff("Rahul Sharma", 35, "Administration");

        // displaying the role of teacher , student and staff
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
