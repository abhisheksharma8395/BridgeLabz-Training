public class Patients {
    // Static variable hospitalName shared among all patients
    private static String hospitalName;
    private static int totalPatients = 0;                  // Stores the number of totalPatient
    // Instance variables
    private final String PATIENT_ID;                       // Final variable to uniquely identify each patient by their id
    private String name;                                   // Stores the name of patient
    private int age;                                       // Stores the age of patient
    private String ailment;                                // Stores the ailment of patient
    // Constructor of Patients class to initialize name, age, ailment, and patientID
    public Patients(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.PATIENT_ID = patientID;
        totalPatients++;
    }
    // Static method to set the hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }
    // Static method to get the total number of patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }
    // Method to display patient details
    public void displayPatientDetails() {
        // Using 'instanceof' to verify the object's type before displaying details
        if (this instanceof Patients) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + PATIENT_ID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }
    // Getters method for instance variable like name , age , ailment and PATIENT_ID
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAilment() {
        return ailment;
    }
    public String getPATIENT_ID() {
        return PATIENT_ID;
    }

    // Main method
    public static void main(String[] args) {

        // Set the hospital name (static variable)
        Patients.setHospitalName("City Hospital");
        // Create object of Patients class instances
        Patients patient1 = new Patients("Lathika", 30, "Flu", "P001");
        Patients patient2 = new Patients("Lidiya", 45, "Fracture", "P002");
        // Display total number of patients admitted
        System.out.println("Total Patients Admitted: " + Patients.getTotalPatients());
        // Display patient details
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
    }
}
