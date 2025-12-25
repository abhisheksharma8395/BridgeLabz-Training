// Person class
class Persons {
    protected String name;                                     // Stores the name of person
    protected int id;                                          // stores the id of person

    // Constructor of person class
    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person information
    public void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Worker Interface 
interface Worker {
    void performDuties();                     // Abstract method to be implemented by all workers that shows what duties they perform
}

// Chef class Subclass of person class and also implementing the Worker interface
class Chef extends Persons implements Worker {
    private String speciality;                                                  // Stores the Speciality of Chef 

    // Constructor of Chef class
    public Chef(String name, int id, String speciality) {
        super(name, id); //                                Call to superclass (Worker) constructor
        this.speciality = speciality;
    }

    // Implementation of performDuties() for a Chef
    @Override
    public void performDuties() {
        System.out.println("\n--- Chef Duties ---");
        showInfo(); // Display basic info from superclass
        System.out.println("Speciality : " + speciality);
        System.out.println("Duties     : Prepares delicious dishes and manages kitchen.");
    }
}

// Waiter class extending the Persons class and also extending the Worker interface
class Waiter extends Persons implements Worker {
    private String shift;                                                           // Stores the shift of worker

    // Constructor to initialize waiter-specific details
    public Waiter(String name, int id, String shift) {
        super(name, id); // Call to superclass constructor
        this.shift = shift;
    }

    // Implementation of performDuties() for a Waiter
    @Override
    public void performDuties() {
        System.out.println("\n--- Waiter Duties ---");
        showInfo(); // Display basic info from superclass
        System.out.println("Shift  : " + shift);
        System.out.println("Duties : Takes orders, serves food, and attends customers.");
    }
}

// Main class to run the program and demonstrate hybrid inheritance
public class RestaurantManagementSystemWithHybridInheritance {
    public static void main(String[] args) {
        // Creating Chef object 
        Chef chef = new Chef("Vikas Khanna", 101, "Indian Cuisine");

        // Created Waiter object 
        Waiter waiter = new Waiter("Carlos Rivera", 202, "Evening");

        // Displaying duties of both Chef and Waiter
        chef.performDuties();
        waiter.performDuties();
    }
}
