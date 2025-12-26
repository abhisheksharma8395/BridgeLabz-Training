// GPS Interface
interface GPS {
    String getCurrentLocation();                         // Abstract method for getting current location
    void updateLocation(String newLocation);             // Abstract method for updating the location
}

// Abstract Vehicles Class implementing the GPS interface
abstract class Vehicles implements GPS {
    private String vehicleId;                                   // Stores the Vehicle id
    private String driverName;                                  // Stores the Driver name of that vehicle
    private double ratePerKm;                                   // Stores the rate per kilometer
    private String currentLocation;                             // Stores the current location of vehicle

    // Constructor of Vehicles class
    public Vehicles(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    // Abstract method calculateFare of Vehicle class
    public abstract double calculateFare(double distance);

    // This method is used to Display the Vehicle Details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Getter and setter method for vehicleId , driverName and ratePerKm
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }

    // GPS interface methods
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Car extending the parent class Vehicles
class Cars extends Vehicles {

    // Constructor of Cars class
    public Cars(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);           // Calling the super class (Vehicles) constructor
    }

    // This method is used to calculate fare of the journey with Car
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base fare for car
    }
}

// Subclass Bike Extending the parent class Vehicles
class Bikes extends Vehicles {
    // constructor of Bikes class
    public Bikes(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);           // Calling the super class (Vehicles) constructor
    }

    // This method is used to calculate fare of the journey with Bike
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // lower base fare for bike
    }
}

// Subclass Auto extending the parent Vehicle class
class Autos extends Vehicles {
    // Constructor of Autos class
    public Autos(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);           // Calling the super class (Vehicles) constructor
    }
    // This method is used to calculate fare of the journey with auto
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30; // base fare for auto
    }
}

// Main Class to test the above program
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating the array of Vehicles class
        Vehicles[] rides = new Vehicles[3];
        rides[0] = new Cars("CAR123", "Ravi Sharma", 15, "Sector 18");
        rides[1] = new Bikes("BIKE456", "Amit Kumar", 8, "Noida City Center");
        rides[2] = new Autos("AUTO789", "Pooja Singh", 10, "Botanical Garden");

        double distance = 10.5; // in kilometers

        for (Vehicles v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            v.updateLocation("Destination Reached");
            System.out.println("Updated Location: " + v.getCurrentLocation());
            System.out.println("---------------------------------------------");
        }
    }
}
