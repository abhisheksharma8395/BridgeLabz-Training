package smart_city_transport_and_service_management_system;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Service> services = new ArrayList<>();

        Service s1  = new BusService(LocalTime.of(8,0,25),  LocalTime.of(13,30,50), new Pair("New Delhi",240,250), new Pair("Mumbai",500,510),  "Government",60);
        Service s2  = new BusService(LocalTime.of(14,0,0),  LocalTime.of(8,30,50),  new Pair("Mumbai",500,510), new Pair("Bangalore",1220,1250),  "Private",30);
        Service s3  = new BusService(LocalTime.of(6,45,0),  LocalTime.of(18,15,0),  new Pair("Chennai",700,710), new Pair("Hyderabad",850,860),  "Private",40);
        Service s4  = new MetroService(LocalTime.of(8,0,25),LocalTime.of(9,30,50),  new Pair("New Delhi",240,250), new Pair("Noida",275,278),  "Sky Blue");
        Service s5  = new MetroService(LocalTime.of(10,0,0),LocalTime.of(10,45,0),  new Pair("Dwarka",260,265), new Pair("Rajiv Chowk",270,275),  "Yellow");
        Service s6  = new MetroService(LocalTime.of(18,30,0),LocalTime.of(19,15,0),  new Pair("Noida",275,278), new Pair("Vaishali",285,288), "Blue");
        Service s7  = new TaxiService(LocalTime.of(10,15,25),LocalTime.of(6,30,50),  new Pair("Pune",657,688), new Pair("Kanyakumari",2268,2270),  "Mr. Abc");
        Service s8  = new TaxiService(LocalTime.of(9,0,0), LocalTime.of(11,30,0),  new Pair("Mumbai",500,510), new Pair("Pune",657,688),  "Mr. XYZ");
        Service s9  = new TaxiService(LocalTime.of(22,0,0),LocalTime.of(5,30,0),   new Pair("Bangalore",1220,1250), new Pair("Mysore",1280,1300),  "Mr. Rahul");
        Service s10 = new BusService(LocalTime.of(7,0,0),  LocalTime.of(19,0,0),  new Pair("Jaipur",300,310), new Pair("Delhi",240,250), "Government",60);

        services.add(s1);
        services.add(s2);
        services.add(s3);
        services.add(s4);
        services.add(s5);
        services.add(s6);
        services.add(s7);
        services.add(s8);
        services.add(s9);
        services.add(s10);

        s1.addPassenger(new Passenger("Abhishek Sharma","PID101","Male",23));
        s1.addPassenger(new Passenger("Virat Kohli","PID102","Male",37));
        s2.addPassenger(new Passenger("Rohit Sharma","PID103","Male",39));
        s2.addPassenger(new Passenger("Yuvraj Singh","PID104","Male",43));
        s3.addPassenger(new Passenger("Virendra Sehwag","PID105","Male",44));
        s4.addPassenger(new Passenger("Ravi Shastri","PID106","Male",56));


        // Lambda Expression for printing the list of Bus sorted by Lowest Fare
        sortingOnLowestFare(services).stream().filter((Service service) -> service instanceof BusService).toList().forEach(Service::printServiceDetails);

        // Lambda Expression for printing the list of Metro sorted by Arrival Time
        sortingOnArrivalTime(services).stream().filter((Service service) -> service instanceof BusService).toList().forEach(Service::printServiceDetails);

        // Printing the list
        services.forEach(Service :: printServiceDetails);

        // Revenue
        services.stream().forEach(Service::totalRevenue);

        // R

    }
    public static List<Service> sortingOnLowestFare(List<Service> list){
        List<Service> sortedServices = list.stream().sorted(Comparator.comparing((Service service) -> service.fare).reversed()).toList();
        return sortedServices;
    }

    public static List<Service> sortingOnArrivalTime(List<Service> list){
        List<Service> sortedServices = list.stream().sorted(Comparator.comparing((Service service) -> service.arrivalTime)).toList();
        return sortedServices;
    }

}
