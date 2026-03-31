// VehicleInfo acting as a superclass .
class VehicleInfo {
    int maxSpeed;          // Stores the maximum speed of the vehicle
    String fuelType;       // Stores the Type of fuel (e.g., Petrol, Diesel, Electric)

    // Constructor of VehicleInfo class
    public VehicleInfo(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display basic vehicle info (will be overridden by subclasses)
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// CarInfo which is subclass of VehicleInfo 
class CarInfo extends VehicleInfo {
    int seatCapacity;                            // Stores the Seat Capacity of for CarInfo class instances

    // Constructor of CarInfo class 
    public CarInfo(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);                        // Calling parent class(VehilceInfo) constructor
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo to show Car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common vehicle info
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// TruckInfo extending the VehicleInfo class.
class TruckInfo extends VehicleInfo {
    int loadCapacity;                                    // Storing the load capacity for Truck (in kilogram)

    // Constructor of TruckInfo class
    public TruckInfo(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);                       // Call parent constructor
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo to show Truck-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();   // Display common vehicle info
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

// Motorcycle subclass of VehicleInfo
class Motorcycle extends VehicleInfo {
    boolean hasCarrier;                                                      // Storing the motorcycle hasCarrier or not

    // Constructor to initialize both Vehicle and Motorcycle attributes
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType); // Call parent constructor
        this.hasCarrier = hasCarrier;
    }

    // Overriding displayInfo to show Motorcycle-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common vehicle info
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class to test the class
public class VehicleAndTransportSystem {
    // Main Method
    public static void main(String[] args) {
        // Creating objects of CarInfo
        VehicleInfo car = new CarInfo(180, "Petrol", 5);
        VehicleInfo truck = new TruckInfo(120, "Diesel", 8000);
        VehicleInfo motorcycle = new Motorcycle(150, "Electric", true);

        // Array of Vehicle type demonstrating polymorphism
        VehicleInfo[] vehicles = {car, truck, motorcycle};

        // Displaying details for each vehicle using dynamic method dispatch
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\n--- Vehicle " + (i + 1) + " Details ---");
            vehicles[i].displayInfo();  // Runtime polymorphism
        }
    }
}
