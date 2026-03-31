// Insurable interface
interface Insurable{
    double calculateInsurance();                // Calculate the insurance of Vehicle
    String getInsuranceDetails();               // Displays the insurance details of Vehicle
}

abstract class VehicleDetails {
    private String vehicleNumber;                    // Stores the vehicleNumber
    private String type;                             // Storing the type of vehicle
    private int rentalRate;                          // storing the rental rate of that vehicle

    // Abstract Method for calculating the rental cost
    abstract double calculateRentalCost(int days);

    // Constructor of VehicleDetails class
    public VehicleDetails(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter and Setter method for VehicleNumber , type and rental rate
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getRentalRate() {
        return rentalRate;
    }

    // Display the Information of Vehicle
    void showInfo(int days){
        System.out.println("Vehicle Type: " + type);
        System.out.println("Vehicle Rental Rate per Day: " + getRentalRate());
        System.out.println("Total Rental Cost: "+calculateRentalCost(days));
    }
}

// Subclass Car extending the parent class VehicleDetails and also implementing the interface Insurable
class Car extends VehicleDetails implements Insurable{
    // Constructor of Class Car
    public Car(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);                     // Calling the constructor of super class (VehicleDetails)
    }

    // Defining the abstract method of parent class VehicleDetails to calculate the rental cost for Car vehicle
    double calculateRentalCost(int days){
        return  getRentalRate() * days;
    }

    // Calculates the Insurance of vehicle
    public double calculateInsurance(){
        return getRentalRate()*0.05;
    }

    // Getting the Insurance details of car
    public String getInsuranceDetails(){
        return "5 % Insurance on Car";
    }


}

// Subclass Bike extending the parent class VehicleDetails and also implementing the interface Insurable
class Bike extends VehicleDetails implements Insurable{
    // Constructor of Class Bike
    public Bike(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Defining the abstract method of parent class VehicleDetails to calculate the rental const for Bike vehicle
    double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    // Calculates the Insurance of vehicle
    public double calculateInsurance(){
        return getRentalRate()*0.02;
    }

    // Getting the Insurance details of Bike
    public String getInsuranceDetails(){
        return "2 % Insurance on Bike";
    }

}
// Subclass Truck extending the parent class VehicleDetails and also implementing the interface Insurable
class Truck extends VehicleDetails implements Insurable{
    // Constructor of Class Truck
    public Truck(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    // Defining the abstract method of parent class VehicleDetails to calculate the rental const for Truck vehicle
    double calculateRentalCost(int days){
        return  getRentalRate() * days;
    }
    // Calculates the Insurance of vehicle
    public double calculateInsurance(){
        return getRentalRate()*0.10;
    }
    // Getting the Insurance details of Truck
    public String getInsuranceDetails(){
        return "10 % Insurance on Truck";
    }
}

// Main class to test the program
public class VehicleRentalSystem {
    // Main method
    public static void main(String[] args) {
        int rentalDays = 5;
        // Creating the array of VehicleDetails class
        VehicleDetails[] vehicle = new VehicleDetails[3];
        vehicle[0] = new Car("DL5CQ1818", "Coupe", 5000);
        vehicle[1] = new Bike("TN01BH1979","Adventure Tourer",400);
        vehicle[2] = new Truck("MH12GJ1234","Goods Transport Vehicle",40);
        for(VehicleDetails v : vehicle){
            v.showInfo(rentalDays);
            Insurable ins = (Insurable) v;
            double insurance = ins.calculateInsurance();
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Insurance cost: " + insurance);
            System.out.println("Total Cost (Rental + Insurance): " + ((insurance)+v.calculateRentalCost(rentalDays)));
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
