package smart_city_transport_and_service_management_system;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public abstract class Service implements TransportService {
    LocalTime departureTime;
    LocalTime arrivalTime;
    Pair fromCity;
    Pair toCity;
    double fare;
    double totalTime;
    double distance;

    public Service(LocalTime departureTime,LocalTime arrivalTime,Pair fromCity , Pair toCity, double fare){
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fare = fare;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.totalTime = ChronoUnit.MINUTES.between(departureTime,arrivalTime);
        this.distance = GeoUtils.calculateDistance(fromCity,toCity);
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
}
