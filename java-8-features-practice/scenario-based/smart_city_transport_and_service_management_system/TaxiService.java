package smart_city_transport_and_service_management_system;

import java.time.LocalTime;

public class TaxiService extends Service{

    String taxiDriverName;
    int totalCapacity = 4;

    public TaxiService(LocalTime departureTime, LocalTime arrivalTime, Pair fromCity , Pair toCity, String taxiDriverName){
        super(departureTime, arrivalTime, fromCity, toCity);
        this.taxiDriverName = taxiDriverName;
    }

    @Override
    public void printServiceDetails(){
        System.out.println("Taxi Service");
        super.printServiceDetails();
        System.out.println("Taxi Driver Name : "+this.taxiDriverName);
        System.out.println("====================================================================");

    }

    @Override
    public void addPassenger(Passenger passenger) {
        if(totalPassenger < this.totalCapacity){
            this.passengerList.add(passenger);
            System.out.println("Passenger with name "+passenger.passengerName+" Added Successfully");
            this.totalPassenger++;
        }
        else{
            System.out.println("Taxi Capacity get fulled");
        }

    }

    // Return fare for 1 km of Taxi
    @Override
    public double calculateFare() {
        return 6.0;
    }
}
