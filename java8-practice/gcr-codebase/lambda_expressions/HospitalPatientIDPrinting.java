package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class HospitalPatientIDPrinting {
    public static void main(String[] args) {
        // Storing the objects of Patient class into the list
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1001, "John Doe", "2024-01-10", "Viral"));
        patients.add(new Patient(1002, "Emily Smith", "2024-01-12", "Dengue"));
        patients.add(new Patient(1003, "Michael Brown", "2024-01-13", "Malaria"));
        patients.add(new Patient(1004, "Sophia Johnson", "2024-01-15", "Typhoid"));
        patients.add(new Patient(1005, "Daniel Wilson", "2024-01-16", "Viral"));
        patients.add(new Patient(1006, "Olivia Davis", "2024-01-18", "Influenza"));
        patients.add(new Patient(1007, "James Miller", "2024-01-20", "Chikungunya"));
        patients.add(new Patient(1008, "Emma Garcia", "2024-01-22", "Malaria"));
        patients.add(new Patient(1009, "Liam Martinez", "2024-01-25", "Dengue"));
        patients.add(new Patient(1010, "Ava Rodriguez", "2024-01-28", "Typhoid"));

        // Using method reference
        patients.stream().forEach(Patient :: getID);
    }
}

// Patient class
class Patient {
    public int patientId;                              // Stores the id of patients
    public String patientName;                         // Stores the name of patient
    public String dateOfAdmission;                    // Stores the Date of admission of the patient
    public String feverType;                          // Stores the fever type of patient

    // Constructor of Patient class to initialize the instance variable
    public Patient(int patientId, String patientName, String dateOfAdmission, String feverType) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dateOfAdmission = dateOfAdmission;
        this.feverType = feverType;
    }

    @Override
    public String toString(){
       return "Patient Name : "+this.patientName+"\n Patient Id : "+this.patientId+"\n Date of Admission : "+this.dateOfAdmission+"\nFever Type : "+this.feverType;
    }

    public void getID(){
        System.out.println("Patient Id : "+this.patientId);
    }
}
