package stream_api.hospital_doctor_availability;

import javax.print.Doc;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Doctor d1  = new Doctor("Dr. Smith", "Cardiology", true);
        Doctor d2  = new Doctor("Dr. Adams", "Dermatology", false);
        Doctor d3  = new Doctor("Dr. Brown", "Neurology", true);
        Doctor d4  = new Doctor("Dr. Wilson", "Orthopedics", true);
        Doctor d5  = new Doctor("Dr. Taylor", "Pediatrics", false);
        Doctor d6  = new Doctor("Dr. Martinez", "Oncology", true);
        Doctor d7  = new Doctor("Dr. Anderson", "Radiology", false);
        Doctor d8  = new Doctor("Dr. Thomas", "Psychiatry", true);
        Doctor d9  = new Doctor("Dr. Jackson", "Gastroenterology", true);
        Doctor d10 = new Doctor("Dr. White", "Urology", false);
        Doctor d11 = new Doctor("Dr. Harris", "Nephrology", true);
        Doctor d12 = new Doctor("Dr. Clark", "Endocrinology", false);
        Doctor d13 = new Doctor("Dr. Lewis", "Pulmonology", true);
        Doctor d14 = new Doctor("Dr. Young", "ENT", true);
        Doctor d15 = new Doctor("Dr. Hall", "Rheumatology", false);
        Doctor d16 = new Doctor("Dr. Allen", "General Surgery", true);
        Doctor d17 = new Doctor("Dr. King", "Plastic Surgery", false);
        Doctor d18 = new Doctor("Dr. Wright", "Emergency Medicine", true);
        Doctor d19 = new Doctor("Dr. Scott", "Pathology", false);
        Doctor d20 = new Doctor("Dr. Green", "Family Medicine", true);

        Doctor.doctors.stream().filter((Doctor doctor) -> doctor.availableOnWeekends).sorted(Comparator.comparing((Doctor doctor) -> doctor.speciality)).toList().forEach(System.out::println);
    }
}
