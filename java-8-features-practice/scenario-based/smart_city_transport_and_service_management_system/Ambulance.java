package smart_city_transport_and_service_management_system;

@EmergencyService
public class Ambulance {
    String ambulanceNumber;
    boolean isPatientInside;

    public Ambulance(String ambulanceNumber,boolean isPatientInside){
        this.ambulanceNumber = ambulanceNumber;
        this.isPatientInside = isPatientInside;
    }

    public void display(){
        System.out.println("Ambulance Number : "+this.ambulanceNumber+" , Is there Patient inside the Ambulance "+this.isPatientInside);
    }
}
