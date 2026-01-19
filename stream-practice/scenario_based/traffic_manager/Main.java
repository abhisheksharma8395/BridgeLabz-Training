package scenario_based.traffic_manager;

public class Main {
    public static void main(String[] args) {
        // Creating the object of TrafficManager class
        TrafficManager trafficManager = new TrafficManager(5,3);

        // Adding vehicle by using the method addVehicle of trafficManager class
        trafficManager.addVehicle("DL01AB1234");
        trafficManager.addVehicle("DL02CD5678");
        trafficManager.addVehicle("UP14EF9012");
        trafficManager.addVehicle("HR26GH3456");
        trafficManager.addVehicle("MH20JK7890");
        trafficManager.addVehicle("RJ14LM1122");
        trafficManager.addVehicle("MP09NP3344");
        trafficManager.addVehicle("PB10QR5566");
        trafficManager.addVehicle("GJ01ST7788");
        trafficManager.addVehicle("TN07UV9900");

        trafficManager.removeVehicleFromCity("DL02CD5678");
        trafficManager.display();
    }
}
