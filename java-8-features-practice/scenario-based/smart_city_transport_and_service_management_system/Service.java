package smart_city_transport_and_service_management_system;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public abstract class Service implements TransportService, FareCalculator {
    int totalPassenger = 0;
    List<Passenger> passengerList;
    LocalTime departureTime;
    LocalTime arrivalTime;
    Pair fromCity;
    Pair toCity;
    double fare;
    double totalTime;
    double distance;

    public Service(LocalTime departureTime,LocalTime arrivalTime,Pair fromCity , Pair toCity){
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.totalTime = ChronoUnit.MINUTES.between(departureTime,arrivalTime);
        this.distance = GeoUtils.calculateDistance(fromCity,toCity);
        this.fare = calculateFare()*distance;
        this.passengerList = new ArrayList<>();
    }

    public void printServiceDetails(){
        System.out.println("Departure Time : "+this.departureTime);
        System.out.println("Arrival Time : "+this.arrivalTime);
        System.out.println("From City : "+this.fromCity.cityName);
        System.out.println("To City : "+this.toCity.cityName);
        System.out.println("Fare : "+this.fare);
        System.out.println("Total Time : "+this.totalTime);
        System.out.println("Total Distance : "+this.distance);
    }

    public abstract void addPassenger(Passenger passenger);

    public void deletePassenger(Passenger passenger){
        if(this.passengerList.contains(passenger)){
            passengerList.remove(passenger);
            System.out.println("Passenger with name "+passenger.passengerName+" deleted Successfully");
        }
        else{
            System.out.println("List does not contains Passenger with name "+passenger.passengerName);
        }
    }

    public void totalRevenue(){
        System.out.printf("Revenue = %.2f , ",this.passengerList.size()*fare);
    }
}
