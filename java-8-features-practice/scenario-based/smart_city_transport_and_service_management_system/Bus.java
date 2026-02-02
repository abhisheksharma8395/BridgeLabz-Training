package smart_city_transport_and_service_management_system;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bus extends Service{
    String busType;

    public Bus(LocalTime departureTime, LocalTime arrivalTime, Pair fromCity , Pair toCity, double fare, String busType){
        super(departureTime, arrivalTime, fromCity, toCity, fare);
        this.busType = busType;
    }

    @Override
    public void printServiceDetails(){
        System.out.println("Bus Service");
        super.printServiceDetails();
        System.out.println("Bus Type( Goverment or Private : "+this.busType);
    }
}
