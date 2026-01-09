import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem {
    public static void main(String[] args) {
        // Creating 10 Users
        User user1 = new User("Amit", "22");
        User user2 = new User("Rohit", "30");
        User user3 = new User("Simran", "25");
        User user4 = new User("Priya", "28");
        User user5 = new User("Kabir", "35");
        User user6 = new User("Megha", "26");
        User user7 = new User("Arjun", "32");
        User user8 = new User("Neha", "24");
        User user9 = new User("Vikas", "27");
        User user10 = new User("Riya", "29");

        // Creating 10 Flights
        Flight flight1 = new Flight("Indigo 101", "2026-01-10", "2026-01-10", "12:30", "14:30","Delhi","Pune");
        Flight flight2 = new Flight("Indigo 102", "2026-01-11", "2026-01-11", "15:00", "17:30","Delhi","Mumbai");
        Flight flight3 = new Flight("AirIndia 201", "2026-01-12", "2026-01-12", "10:00", "12:00","Pune","Delhi");
        Flight flight4 = new Flight("AirIndia 202", "2026-01-13", "2026-01-13", "09:30", "11:30","Delhi","Kolkata");
        Flight flight5 = new Flight("Vistara 301", "2026-01-14", "2026-01-14", "18:00", "20:00","Kolkata","Delhi");
        Flight flight6 = new Flight("Vistara 302", "2026-01-15", "2026-01-15", "08:00", "10:00","Bangalore","Delhi");
        Flight flight7 = new Flight("SpiceJet 401", "2026-01-16", "2026-01-16", "20:00", "22:00","Delhi","Bangalore");
        Flight flight8 = new Flight("SpiceJet 402", "2026-01-17", "2026-01-17", "06:00", "08:00","Mumbai","Delhi");
        Flight flight9 = new Flight("GoAir 501", "2026-01-18", "2026-01-18", "11:00", "13:00","Delhi","Chennai");
        Flight flight10 = new Flight("GoAir 502", "2026-01-19", "2026-01-19", "07:30", "09:30","Chennai","Delhi");

        // Creating Booking Object
        Booking booking = new Booking();

        // Adding flights to booking system
        booking.addFlight(flight1);
        booking.addFlight(flight2);
        booking.addFlight(flight3);
        booking.addFlight(flight4);
        booking.addFlight(flight5);
        booking.addFlight(flight6);
        booking.addFlight(flight7);
        booking.addFlight(flight8);
        booking.addFlight(flight9);
        booking.addFlight(flight10);

        // Adding Users to a few flights
        booking.addUser(flight1, user1);
        booking.addUser(flight1, user2);
        booking.addUser(flight2, user3);
        booking.addUser(flight2, user4);
        booking.addUser(flight3, user5);
        booking.addUser(flight3, user6);
        booking.addUser(flight4, user7);
        booking.addUser(flight5, user8);
        booking.addUser(flight5, user9);
        booking.addUser(flight10, user10);

        // Performing Booking class methods:

        // Searching the Flight between Delhi And Mumbai
        booking.search("Delhi", "Mumbai");

        // Searching the Flight from Delhi
        booking.search("Delhi");

        // Displaying All The Details
        booking.detailsDetails();

        // Checking Empty Seats
        booking.emptySpace(flight1);
        booking.emptySpace(flight3);

        // Removing user1
        booking.removeUser(flight1, user1);
        // Displaying Details after removing user 1
        booking.detailsDetails();
    }
}


// User Class
class User {
    String userName;                     // Stores the name of user
    String age;                          // Stores the age of the user

    // Constructor of User class to initialize variables
    public User(String userName, String age) {
        this.userName = userName;
        this.age = age;
    }

    // This method is used to Display the details of the User
    public void display() {
        System.out.println("_____________________________________________________________________________________");
        System.out.println("UserName:" + this.userName);
        System.out.println("Age:" + this.age);
        System.out.println("_____________________________________________________________________________________");

    }

}

// Flight class
class Flight {
    String flightName;                                               // Stores the name of Flight
    String departureDate;                                            // Stores the Date of Flight
    String arrivalDate;                                              // Stores the Arrival Date of flight
    String departureTime;                                            // Stores the Departure Date of flight
    String arrivalTime;                                              // Stores the Arrival Time of Flight
    String fromCity;                                                 // Stores the City from Which Flight starts from
    String toCity;                                                   // Stores the City to Which Flight goes
    int capacity = 200;                                              // Stores the capacity of flight
    List<User> users;                                                // Stores the List of All user who booked the flight

    // Constructor of Flight class to initialize variables
    public Flight(String flightName, String departureDate, String arrivalDate,String departureTime,String arrivalTime,String fromCity, String toCity) {
        this.flightName = flightName;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.users = new ArrayList<>();
    }

    // This method is used to Display the Details of all Users who booked this flight
    public void displayUsers() {
        System.out.println("____________________________________________________________________________________");
        System.out.println("Flight Details : ");
        System.out.println("Flight Name : "+this.flightName);
        System.out.println("Arrival Date : "+this.arrivalDate);
        System.out.println("Departure Date : "+this.departureDate);
        System.out.println("Arrival Time : "+this.arrivalTime);
        System.out.println("Departure Time : "+this.departureTime);
        System.out.println("From City : "+this.fromCity);
        System.out.println("To City : "+this.toCity);
        System.out.println("Capacity : "+this.capacity);
        System.out.println("_____________________________________________________________________________________");
        System.out.println("Users Details : ");
        for(User user : this.users) {
            user.display();
        }
    }

    // This method is used to Display the flight Details
    public void display() {
        System.out.println("____________________________________________________________________________________");
        System.out.println("Flight Details : ");
        System.out.println("Flight Name : "+this.flightName);
        System.out.println("Arrival Date : "+this.arrivalDate);
        System.out.println("Departure Date : "+this.departureDate);
        System.out.println("Arrival Time : "+this.arrivalTime);
        System.out.println("Departure Time : "+this.departureTime);
        System.out.println("From City : "+this.fromCity);
        System.out.println("To City : "+this.toCity);
        System.out.println("Capacity : "+this.capacity);
        System.out.println("_____________________________________________________________________________________");
    }

}

// Booking class
class Booking {
    List<Flight> flights;                                                                    // Stores the list of flight

    // Constructor of Booking class
    public Booking() {
        flights = new ArrayList<>();
    }

    // This method is used to add flight
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // This method is used to Add user into the specific flight
    public void addUser(Flight flight , User user) {
        if(this.flights.contains(flight)) {
            if(flight.users.size() == flight.capacity) {
                System.err.println("Flight is already full");
            }
            flight.users.add(user);
        }
        else{
            System.err.println("There is no such flight available");
        }
    }

    // This method is used to Remove user into the specific flight
    public void removeUser(Flight flight , User user) {
        if(this.flights.contains(flight)) {
            if(flight.users.size() == 0) {
                System.err.println("Flight is already Empty");
            }
            flight.users.remove(user);
        }
        else{
            System.err.println("There is no such flight available");
        }
    }

    // This method is used to search flight between two cities
    public void search(String fromCity, String toCity) {
        System.out.println("Flight Details Between Cities "+fromCity+" to "+toCity+" : ");
        System.out.println("_____________________________________________________________________________________");
        fromCity = fromCity.toLowerCase();
        toCity = toCity.toLowerCase();
        for(Flight flight : flights) {
            if(flight.fromCity.toLowerCase().equals(fromCity) && flight.toCity.toLowerCase().equals(toCity)) {
                flight.display();
            }
        }
        System.out.println("_____________________________________________________________________________________");
    }

    // This method is used to search flight departing from one city
    public void search(String fromCity) {
        System.out.println("Flight Details From City : "+fromCity);
        System.out.println("_____________________________________________________________________________________");
        fromCity = fromCity.toLowerCase();
        for(Flight flight : flights) {
            if(flight.fromCity.toLowerCase().equals(fromCity)) {
                flight.display();
            }
        }
        System.out.println("_____________________________________________________________________________________");

    }

    // This method is used to display the All Details of Flight
    public void detailsDetails() {
        for(Flight flight : flights) {
            flight.displayUsers();
        }
    }


    // This method Print how many spaces are vacant in flight
    public void emptySpace(Flight flight) {
        if(this.flights.contains(flight)) {
            System.out.println("In Flight "+flight.flightName+" Remaining Empty Seats are : "+(flight.capacity-flight.users.size()));
        }
    }

}
