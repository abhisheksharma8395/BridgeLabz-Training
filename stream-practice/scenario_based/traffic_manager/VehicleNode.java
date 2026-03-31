package traffic_manager;


// VehicleNode class
public class VehicleNode {
    String vehicleNumber;                                // Stores the Vehicle Number of Vehicle
    VehicleNode next;                                    // Stores the reference of next node

    // Constructor of VehicleNode class
    public VehicleNode(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
