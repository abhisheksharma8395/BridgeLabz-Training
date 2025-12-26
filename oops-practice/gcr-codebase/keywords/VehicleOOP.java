public class VehicleOOP {
   // Static variable registrationFee shared by all vehicles
   private static double registrationFee = 100.0; // Default registration fee
   // Instance variables
   private final String REGISTRATION_NUMBER; // Final variable to ensure the registration number cannot be changed
   private String ownerName;                    // Stores the owner name of vehicle
   private String vehicleType;                  // Stores the Vehicle type

   // Constructor VehicleOOP to initialize ownerName, vehicleType, and registrationNumber
   public VehicleOOP(String ownerName, String vehicleType, String registrationNumber) {
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
       this.REGISTRATION_NUMBER = registrationNumber;
   }
   // Static method to update the registration fee
   public static void updateRegistrationFee(double newFee) {
       if (newFee >= 0.0) {
           registrationFee = newFee;
       } else {
           System.out.println("Invalid registration fee. Please enter a non-negative value.");
       }
   }
   // Method to display vehicle registration details
   public void displayRegistrationDetails() {
       if (this instanceof VehicleOOP) {
           System.out.println("Owner Name: " + ownerName);
           System.out.println("Vehicle Type: " + vehicleType);
           System.out.println("Registration Number: " + REGISTRATION_NUMBER);
           System.out.println("Registration Fee: $" + registrationFee);
       } else {
           System.out.println("The object is not an instance of the Vehicle class.");
       }
   }

   // Getter methods for instance variables like ownerName , vehicleType , REGISTRATION_NUMBER
   public String getOwnerName() {
       return ownerName;
   }
   public String getVehicleType() {
       return vehicleType;
   }
   public String getREGISTRATION_NUMBER() {
       return REGISTRATION_NUMBER;
   }

   // Main method
   public static void main(String[] args) {
       // Update the registration fee for all vehicles
       VehicleOOP.updateRegistrationFee(150.0); // Set registration fee to $150.0
       // Create new vehicle instances
       VehicleOOP vehicle1 = new VehicleOOP("Honest raj", "Sedan", "ABC123");
       VehicleOOP vehicle2 = new VehicleOOP("Price danish", "SUV", "XYZ789");
       // Display vehicle registration details
       vehicle1.displayRegistrationDetails();
       System.out.println();
       vehicle2.displayRegistrationDetails();
   }
}
