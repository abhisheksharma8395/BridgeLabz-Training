// VehicleInfo acting as the superclass in this program for the other classes
class VehiclesInfo {
    protected double maxSpeed;                         // Stores the maximum speed of the vehicle
    protected String model;                            // Stores the model of vehicle

    // Constructor of VehicleInfo class
    public VehiclesInfo(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    public void showInfo() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

// Refuelable Interface (for petrol or fuel-based vehicles)
interface Refuelable {
    void refuel();         // To be implemented by petrol vehicles or fuel based vehicles
}

// ElectricVehicle subClass of VehiclesInfo
class ElectricVehicle extends VehiclesInfo {
    private double batteryCapacity;                    // Stores the battery capacity of Electric Vehicle

    // Constructor of ElectricVehicle class
    public ElectricVehicle(double maxSpeed, String model, double batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // This method displays when vehicle started charging.
    public void charge() {
        System.out.println("Charging "+this.model+" with " + batteryCapacity + " kWh battery.");
    }

    @Override
    public void showInfo() {
        System.out.println("=== Electric Vehicle ===");
        super.showInfo();
        System.out.println("Battery   : " + batteryCapacity + " kWh");
    }
}

// PetrolVehicle extending VehicleInfo class and implements Refuelable interface
class PetrolVehicle extends VehiclesInfo implements Refuelable {
    private double tankCapacity;                           // Stores the tank capacity of petrol vehicle

    // Constructor of PetrolVehicle class
    public PetrolVehicle(double maxSpeed, String model, double tankCapacity) {
        super(maxSpeed, model);
        this.tankCapacity = tankCapacity;
    }

    // Implement refuel method
    @Override
    public void refuel() {
        System.out.println("Refueling "+this.model+" with " + tankCapacity + " liters of fuel.");
    }

    @Override
    public void showInfo() {
        System.out.println("=== Petrol Vehicle ===");
        super.showInfo();
        System.out.println("Fuel Tank : " + tankCapacity + " liters");
    }
}

// Main class to run the system
public class VehicleManagementSystemWithHybridInheritance {
    public static void main(String[] args) {
        // Creating ElectricVehicle class object
        ElectricVehicle ev = new ElectricVehicle(120.0, "Tata Nexon EV", 40.5);
        ev.showInfo();
        ev.charge();

        System.out.println();

        // Create PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle(200.0, "Mahindra XUV700 Petrol", 50.0);
        pv.showInfo();
        pv.refuel();
    }
}
