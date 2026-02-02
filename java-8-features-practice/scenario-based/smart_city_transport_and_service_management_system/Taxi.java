package smart_city_transport_and_service_management_system;

import java.time.LocalDate;
import java.time.LocalTime;

public class Taxi extends Service{

    String taxiDriverName;

    public Taxi(LocalTime departureTime, LocalTime arrivalTime, Pair fromCity , Pair toCity, double fare, String taxiDriverName){
        super(departureTime, arrivalTime, fromCity, toCity, fare);
        this.taxiDriverName = taxiDriverName;
    }

    @Override
    public void printServiceDetails(){
        System.out.println("Taxi Service");
        super.printServiceDetails();
        System.out.println("Taxi Driver Name : "+this.taxiDriverName);
    }
}
