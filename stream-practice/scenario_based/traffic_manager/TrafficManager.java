package traffic_manager;

public class TrafficManager {
    private int maxVehicleRoundAbout;                                                          // Stores the maximum that can be in Round About
    private int maxVehicleWaitingQueue;                                                        // Stores the maximum that can be in Waiting Queue
    private RoundAbout roundAbout;                                                             // Object of RoundAbout class
    private WaitingQueue waitingQueue;                                                         // Object of WaitingQueue class

    // Constructor of TrafficManager class to initialize variables
    public TrafficManager(int maxVehicleRoundAbout, int maxVehicleWaitingQueue) {
        this.maxVehicleRoundAbout = maxVehicleRoundAbout;
        this.maxVehicleWaitingQueue = maxVehicleWaitingQueue;
        this.roundAbout = new RoundAbout(maxVehicleRoundAbout);
        this.waitingQueue = new WaitingQueue(maxVehicleWaitingQueue);
    }

    // This method is used to try to enter the vehicle in city
    public void addVehicle(String vehicleNumber) {
        if (this.roundAbout.currentVehiclePresent < this.roundAbout.maxVehicleAllowed) {
            this.roundAbout.addVehicle(vehicleNumber);
        } else if (this.waitingQueue.currentVehiclePresent < this.waitingQueue.maxVehicles) {
            this.waitingQueue.addVehicle(vehicleNumber);
        }
        else{
            System.out.println("Max Vehicles present in city as well as in Waiting Queue please wait for some minutes.");
        }
    }

    // This method is used to try to enter the vehicle in city
    public void removeVehicleFromCity(String vehicleNumber) {
        this.roundAbout.removeVehicle(vehicleNumber);
        if(this.waitingQueue.front!=null) this.roundAbout.addVehicle(this.waitingQueue.removeVehicle());
    }

    // This method is used to display the vehicle present in the Roundabout as well as Waitinh Queue
    public void display(){
        System.out.println("==================================================================");
        System.out.println("============================ RoundAbout Vehicle Details ======================================");
        this.roundAbout.display();
        System.out.println("==================================================================");
        System.out.println("============================ Waiting Queue Vehicle Details ======================================");
        this.waitingQueue.display();
    }
}
