// Device act like a superclass 
class Device {
    String deviceId;                                 // Unique identifier for the device
    String status;                                  // Device status: ON, OFF, etc.

    // Constructor of Device class
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display basic device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}


// Thermostat a subclass for Device
class Thermostat extends Device {
    double temperatureSetting;                                              // Temperature Setting for thermostat

    // Constructor of Thermostat class
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);                                            // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overridden method to display full thermostat settings
    @Override
    public void displayStatus() {
        super.displayStatus();  // Display basic device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the smart home system
public class SmartHomeDevices {
    public static void main(String[] args) {
    	
        // Creating a Thermostat class object
        Thermostat livingRoomThermostat = new Thermostat("TH-001", "ON", 22.5);

        // Displaying the thermostat status
        System.out.println("=== Smart Thermostat Status ===");
        livingRoomThermostat.displayStatus();
    }
}
