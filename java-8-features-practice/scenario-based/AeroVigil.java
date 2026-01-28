import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AeroVigil {
    public static void main(String[] args) throws InvalidFlightException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details of flight in such manner ");
        System.out.println("FlightNumber:FlightName:PassengerCount:CurrentFuelLevel");
        String details = scanner.nextLine();
        String[] flightDetails = details.split(":");
        try{
            FlightUtil.validateFLightNumber(flightDetails[0]);
        }catch(Exception e){
            System.out.println("The Flight number "+flightDetails[0]+" is invalid");
            return;
        }
        try{
            FlightUtil.validateFLightName(flightDetails[1]);
        }catch(Exception e){
            System.out.println("The Flight name "+flightDetails[1]+" is invalid");
            return;
        }
        try{
            FlightUtil.validatePassengerCount(Integer.parseInt(flightDetails[2]),flightDetails[1]);
        }catch(Exception e){
            System.out.println("The Passenger count "+flightDetails[2]+" is invalid for "+flightDetails[1]);
            return;
        }
        try{
            FlightUtil.calculateFuelToFillTank(flightDetails[1],Double.parseDouble(flightDetails[3]));
        }catch(Exception e){
            System.out.println("Invalid fuel level for "+flightDetails[1]);
        }
        System.out.printf("Fuel required to fill the tank:%.1f",FlightUtil.calculateFuelToFillTank(flightDetails[1],Double.parseDouble(flightDetails[3])));
    }
}

class FlightUtil{
    // This method is used to validate the flight number
    public static boolean validateFLightNumber(String flightNumber) throws InvalidFlightException {
        String regex = "^(FL)-[1-9]\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(flightNumber);
        if(matcher.matches()){
            return true;
        }
        else{
            throw new InvalidFlightException("The Flight number "+flightNumber+" is invalid");
        }
    }

    // This method is used to validate the flight name
    public static boolean validateFLightName(String flightName) throws InvalidFlightException {
        HashSet<String> flightSet = new HashSet<>();
        flightSet.add("SpiceJet");
        flightSet.add("Vistara");
        flightSet.add("Indigo");
        flightSet.add("Air Arabia");
        if(flightSet.contains(flightName)){
            return true;
        }
        else{
            throw new InvalidFlightException("The Flight name "+flightName+" is invalid");
        }
    }

    // This method is used to validate the passenger count in the map
    public static boolean validatePassengerCount(int passenger,String flightName) throws InvalidFlightException {
        // This map is used to store flight name and total passenger it can carry
        HashMap<String,Integer> flightMap = new HashMap<>();
        flightMap.put("SpiceJet",396);
        flightMap.put("Vistara",615);
        flightMap.put("Indigo",230);
        flightMap.put("Air Arabia",130);
        if(passenger > 0 && flightMap.get(flightName) >= passenger){
            return true;
        }
        else{
            throw new InvalidFlightException("The Passenger count "+passenger+" is invalid for "+flightName);
        }
    }

    // This method is used to validate the flight name
    public static double calculateFuelToFillTank(String flightName,double currentFuelLevel) throws InvalidFlightException {
        // Map stores the flight name and total fuel capacity
        HashMap<String,Double> flightMap = new HashMap<>();
        flightMap.put("SpiceJet",200000.0);
        flightMap.put("Vistara",300000.0);
        flightMap.put("Indigo",250000.0);
        flightMap.put("Air Arabia",150000.0);
        if(currentFuelLevel >= 0 && flightMap.get(flightName) >= currentFuelLevel){
            return flightMap.get(flightName) - currentFuelLevel;
        }
        else{
            throw new InvalidFlightException("Invalid fuel level for "+flightName);
        }
    }
}

// custom exception InvalidFlightException
class InvalidFlightException extends Exception{
    public InvalidFlightException(String s){
        super(s);
    }
}
