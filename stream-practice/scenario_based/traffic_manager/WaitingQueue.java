package traffic_manager;

// WaitingQueue class
public class WaitingQueue {
    int maxVehicles;                                 // Stores the max Vehicle that can be added to queue
    VehicleNode front;
    VehicleNode rear;
    int currentVehiclePresent;                       // Stores the current vehicles present in the waiting queue

    //Constructor of WaitingQueue class
    public WaitingQueue(int maxVehicles) {
        this.maxVehicles = maxVehicles;
        this.front = null;
        this.rear = null;
        this.currentVehiclePresent = 0;
    }

    // This method is used to add the Vehicle in waiting queue
    public void addVehicle(String vehicleNumber) {
        if (this.currentVehiclePresent == this.maxVehicles) {
            System.out.println("Can't Add vehicle Maximum Vehicle present in Waiting queue");
            return;
        }
        VehicleNode vehicle = new VehicleNode(vehicleNumber);
        if (this.front == null) {
            this.front = this.rear = vehicle;
        } else {
            rear.next = vehicle;
            rear = vehicle;
        }
        System.out.println("Vehicle with vehicle number "+vehicleNumber+" Successfully entered into Waiting Queue please wait to enter in city");
        this.currentVehiclePresent++;
    }

    // This method is used to remove the Vehicle in waiting queue
    public String removeVehicle() {
        if (this.currentVehiclePresent == 0){
            System.out.println("No Vehicle currently present in the waiting queue.");
            return " ";
        }
        if (this.currentVehiclePresent == 1) {
            VehicleNode vehicle = front;
            this.front = this.rear = null;
            this.currentVehiclePresent--;
            System.out.println("Vehicle with vehicle number " + vehicle.vehicleNumber + " exited successfully from the waiting queue");
            return vehicle.vehicleNumber;
        }
        else {
            VehicleNode vehicle = front;
            this.front = front.next;
            this.currentVehiclePresent--;
            System.out.println("Vehicle with vehicle number " + vehicle.vehicleNumber + " exited successfully from the waiting queue");
            return vehicle.vehicleNumber;
        }
    }


    // This method is used to display all the vehicles that is currently present in the waiting queue
    public void display() {
        if (front == null) System.out.println("No Vehicles Present currently in the waititng queue");
        else {
            VehicleNode temp = front;
            System.out.println("--------------------- Vehicles Present : ------------------------");
            for (int i = 0; i < this.currentVehiclePresent; i++) {
                System.out.println(temp.vehicleNumber);
                temp = temp.next;
            }
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
