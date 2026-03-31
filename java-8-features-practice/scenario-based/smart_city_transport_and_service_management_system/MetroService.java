package smart_city_transport_and_service_management_system;

import java.time.LocalTime;

public class MetroService extends Service{
    String line;


    public MetroService(LocalTime departureTime, LocalTime arrivalTime, Pair fromCity , Pair toCity, String line){
        super(departureTime, arrivalTime, fromCity, toCity);
        this.line = line;
    }

    @Override
    public void printServiceDetails(){
        System.out.println("Metro Service");
        super.printServiceDetails();
        System.out.println("Metro Line : "+this.line);
        System.out.println("====================================================================");

    }

    @Override
    public void addPassenger(Passenger passenger) {
        this.passengerList.add(passenger);
        System.out.println("Passenger with name "+passenger.passengerName+" Added Successfully");
        this.totalPassenger++;
    }

    // Return fare for 1 km of Metro
    @Override
    public double calculateFare() {
        return 1.5;
    }
}
