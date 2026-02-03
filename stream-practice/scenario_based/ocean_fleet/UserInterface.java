package ocean_fleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();
        System.out.println("Enter the number of vessels to be added : ");
        int numberOfVessel = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter vessel details : ");
        for (int i = 0; i < numberOfVessel; i++) {
            String input = scanner.nextLine();
            String[] details = input.split(":");
            Vessel vessel = new Vessel(details[0],details[1],Double.parseDouble(details[2]),details[3]);
            vesselUtil.addVesselPerformance(vessel);
        }
        System.out.println("Enter the Vessel Id to check speed : ");
        String vesselId = scanner.next();
        Vessel vessel = vesselUtil.getVesselById(vesselId);
        if(vessel == null){
            System.out.println("Vessel Id "+vesselId+" not found");
        }
        else{
            System.out.println(vessel.getVesselId()+" | "+vessel.getVesselName()+" | "+vessel.getVesselType()+" | "+vessel.getAverageSpeed()+" knots");
        }
        List<Vessel> vessels = vesselUtil.getHighPerformanceVessels();
        System.out.println("High performance vessels are : ");
        for(Vessel v : vessels){
            System.out.println(v.getVesselId()+" | "+v.getVesselName()+" | "+v.getVesselType()+" | "+v.getAverageSpeed()+" knots");
        }
    }
}
