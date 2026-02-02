package smart_city_transport_and_service_management_system;

import java.time.LocalTime;

public class BusService extends Service{
    String busType;
    int totalCapacity;

    public BusService(LocalTime departureTime, LocalTime arrivalTime, Pair fromCity , Pair toCity, String busType,int totalCapacity){
        super(departureTime, arrivalTime, fromCity, toCity);
        this.busType = busType;
        this.totalCapacity = totalCapacity;
    }



    @Override
    public void printServiceDetails(){
        System.out.println("Bus Service");
        super.printServiceDetails();
        System.out.println("Bus Type( Government or Private ) : "+this.busType);
        System.out.println("Total capacity of bus is "+this.totalCapacity);
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
            System.out.println("Bus Capacity get fulled");
        }

    }

    // Return fare for 1 km of Bus
    @Override
    public double calculateFare() {
        return 3.0;
    }
}
