package smart_city_transport_and_service_management_system;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Service> services = new ArrayList<>();

        Service s1  = new Bus(LocalTime.of(8,0,25),  LocalTime.of(13,30,50), new Pair("New Delhi",240,250), new Pair("Mumbai",500,510), 1560, "Government");
        Service s2  = new Bus(LocalTime.of(14,0,0),  LocalTime.of(8,30,50),  new Pair("Mumbai",500,510), new Pair("Bangalore",1220,1250), 2500, "Private");
        Service s3  = new Bus(LocalTime.of(6,45,0),  LocalTime.of(18,15,0),  new Pair("Chennai",700,710), new Pair("Hyderabad",850,860), 1200, "Private");
        Service s4  = new Metro(LocalTime.of(8,0,25),LocalTime.of(9,30,50),  new Pair("New Delhi",240,250), new Pair("Noida",275,278), 50, "Sky Blue");
        Service s5  = new Metro(LocalTime.of(10,0,0),LocalTime.of(10,45,0),  new Pair("Dwarka",260,265), new Pair("Rajiv Chowk",270,275), 40, "Yellow");
        Service s6  = new Metro(LocalTime.of(18,30,0),LocalTime.of(19,15,0),  new Pair("Noida",275,278), new Pair("Vaishali",285,288), 35, "Blue");
        Service s7  = new Taxi(LocalTime.of(10,15,25),LocalTime.of(6,30,50),  new Pair("Pune",657,688), new Pair("Kanyakumari",2268,2270), 4400, "Mr. Abc");
        Service s8  = new Taxi(LocalTime.of(9,0,0), LocalTime.of(11,30,0),  new Pair("Mumbai",500,510), new Pair("Pune",657,688), 1200, "Mr. XYZ");
        Service s9  = new Taxi(LocalTime.of(22,0,0),LocalTime.of(5,30,0),   new Pair("Bangalore",1220,1250), new Pair("Mysore",1280,1300), 800, "Mr. Rahul");
        Service s10 = new Bus(LocalTime.of(7,0,0),  LocalTime.of(19,0,0),  new Pair("Jaipur",300,310), new Pair("Delhi",240,250), 900, "Government");

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


    }
    public List<Service> sortingOnLowestFare(List<Service> list){
        List<Service> sortedSercives = list.stream().sorted(Comparator.comparing((Service service) -> service.fare).reversed()).toList();
        return sortedSercives;
    }

    public List<Service> sortingOnDepartureTime(List<Service> list){
        List<Service> sortedSercives = list.stream().sorted(Comparator.comparing((Service service) -> service.arrivalTime)).toList();
        return sortedSercives;
    }
}
