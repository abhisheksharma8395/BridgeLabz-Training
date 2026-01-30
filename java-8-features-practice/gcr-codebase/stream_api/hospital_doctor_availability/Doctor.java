package stream_api.hospital_doctor_availability;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    static List<Doctor> doctors = new ArrayList<>();          // Stores the details of doctor

    String doctorName;                                     // Stores the name of doctor
    String speciality;                                     // Stores the speciality of doctor
    Boolean availableOnWeekends;                           // Stores is doctor available on weekends or not

    // Constructor of Doctor class to initialize instance variables
    public Doctor(String doctorName,String speciality,Boolean availableOnWeekends){
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.availableOnWeekends = availableOnWeekends;
        doctors.add(this);
    }

    @Override
    public String toString(){
        return "Doctor Name : "+this.doctorName+", Speciality : "+this.speciality+", Available on Weekends : "+this.availableOnWeekends;
    }
}
