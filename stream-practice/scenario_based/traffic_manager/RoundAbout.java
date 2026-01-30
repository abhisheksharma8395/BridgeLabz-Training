package traffic_manager;

public class RoundAbout {
    VehicleNode head;                                   // Stores the first vehicle of Linked List
    VehicleNode tail;                                   // Stores the last vehicle of Linked List
    int maxVehicleAllowed;                             // Stores Maximum Number of Vehicle Allowed in city
    int currentVehiclePresent;                         // Stores the number of Vehicles in the Linked List

    // Constructor of RoundAbout class to initialize the instance variables
    public RoundAbout(int maxVehicleAllowed){
        this.head = null;
        this.tail = null;
        this.maxVehicleAllowed = maxVehicleAllowed;
        this.currentVehiclePresent = 0;
    }

    // This method is used to add the Vehicle in RoundAbout
    public void addVehicle(String vehicleNumber){
        if(this.currentVehiclePresent == maxVehicleAllowed){
            System.out.println("Size Already Full");
            return;
        }
        VehicleNode vehicle = new VehicleNode(vehicleNumber);
        if(this.head == null){
            this.head = this.tail = vehicle;
            this.head.next = this.head;
        }
        else{
            vehicle.next = head;
            tail.next = vehicle;
            tail = vehicle;
        }
        this.currentVehiclePresent++;
        System.out.println("Vehicle Enters the city Successfully with Vehicle number "+vehicleNumber);
    }

    // This method is used to remove the vehicle from roundabout
    public void removeVehicle(String vehicleNumber){
        if(this.currentVehiclePresent == 0) System.out.println("No Vehicle currently present in the city.");
        else if(this.currentVehiclePresent == 1){
            if(head.vehicleNumber.equals(vehicleNumber)){
                head = tail = null;
                this.currentVehiclePresent--;
                System.out.println("Vehicle with vehicle number "+vehicleNumber+" exited successfully from the city");
            }
            else System.out.println("No Vehicle Present in the city with vehicle number "+vehicleNumber);
        }
        else if(head.vehicleNumber.equals(vehicleNumber)){
            this.tail.next = head.next;
            head = head.next;
            this.currentVehiclePresent--;
            System.out.println("Vehicle with vehicle number "+vehicleNumber+" exited successfully from the city");
        }
        else{
            VehicleNode prev = head;
            VehicleNode temp = head.next;
            while(temp!=head && !temp.vehicleNumber.equals(vehicleNumber)){
                prev = temp;
                temp = temp.next;
            }
            if(temp == head){
                System.out.println("No Vehicle Present in the city with vehicle number "+vehicleNumber);
            }
            else{
                prev.next = temp.next;
                this.currentVehiclePresent--;
                System.out.println("Vehicle with vehicle number "+vehicleNumber+" exited successfully from the city");
            }
        }
    }

    // This method is used to display all the vehicles that is currently present in the city
    public void display(){
        if(head == null) System.out.println("No Vehicles Present currently in the city");
        else {
            VehicleNode temp = head;
            System.out.println("--------------------- Vehicles Present : ------------------------");
            for (int i = 0; i < this.currentVehiclePresent; i++) {
                System.out.println(temp.vehicleNumber);
                temp = temp.next;
            }
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
