package smart_city_transport_and_service_management_system;

import java.time.LocalDate;
import java.time.LocalTime;

public class Metro extends Service{
    String line;

    public Metro(LocalTime departureTime, LocalTime arrivalTime, Pair fromCity , Pair toCity, double fare, String line){
        super(departureTime, arrivalTime, fromCity, toCity, fare);
        this.line = line;
    }

    @Override
    public void printServiceDetails(){
        System.out.println("Metro Service");
        super.printServiceDetails();
        System.out.println("Metro Line : "+this.line);
    }
}
