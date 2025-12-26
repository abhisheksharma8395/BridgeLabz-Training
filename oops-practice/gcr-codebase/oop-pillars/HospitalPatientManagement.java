import java.util.ArrayList;
import java.util.List;

// Interface for Medical Record
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

// Abstract Class Patient
abstract class Patient {
    private int patientId;                                          // Stores the patient id
    private String name;                                            // Stores the patient name
    private int age;                                                // Stores the age of patient
    private String diagnosis;                                       // Stores the Diagnosis of patient
    private List<String> medicalHistory = new ArrayList<>();        // Stores the medical history of patient

    // Constructor of Patient class
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract billing method
    public abstract double calculateBill();

    // Concrete method to get details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (diagnosis != null) {
            System.out.println("Diagnosis: " + diagnosis);
        }
    }

    // Getter and Setter method for diagnosis and medicalHistory to perform encapsulation
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public void addToMedicalHistory(String entry) {
        medicalHistory.add(entry);
    }
    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory);
    }
}

// InPatient Subclass of Patient also implementing the MedicalRecord interface.
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;                          // Stores how many days patient remain admitted
    private double dailyCharge;                        // Stores the daily charge patient who is admitted
    private List<String> records = new ArrayList<>();  // Stores the record of the patient

    // Constructor of InPatient class
    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);                    // Calling the super class(Patient) constructor
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    // Calculate the total bill of patient
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    // Adding record of patient in the list so that in future if he/she
    // having any other problem so that figure out easily
    public void addRecord(String record) {
        records.add(record);
        addToMedicalHistory(record); // also add to protected history
    }

    // This display the History of hospital visit of the patient
    public List<String> viewRecords() {
        return records;
    }
}

// OutPatient Subclass of Patient and also implementing the MedicalRecord Interface
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;                           // Stores the consultation fees that patient has to giv
    private List<String> records = new ArrayList<>();          // Stores the record of the patient

    // Constructor of OutPatient class
    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Calculate the fees of Patien
    public double calculateBill() {
        return consultationFee;
    }

    // Adding record of patient in the list so that in future if he/she
    // having any other problem so that figure out easily
    public void addRecord(String record) {
        records.add(record);
        addToMedicalHistory(record);
    }

    // This display the History of hospital visit of the patient
    public List<String> viewRecords() {
        return records;
    }
}

// Main class to test the above code
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create the array of Patient class
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient(101, "XYZ", 45, 4, 1500);
        patients[1] = new OutPatient(102, "ABC", 30, 800);

        for (Patient patient : patients) {
            patient.setDiagnosis("General Checkup");
            patient.getPatientDetails();
            System.out.println("Bill Amount: ₹" + patient.calculateBill());

            // Polymorphism using MedicalRecord
            if (patient instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) patient;
                mr.addRecord("Blood Test: Normal");
                mr.addRecord("X-Ray: Clear");

                System.out.println("Medical Records:");
                for (String record : mr.viewRecords()) {
                    System.out.println("- " + record);
                }
            }

            System.out.println("------------------------------------------------");
        }
    }
}
