package smart_city_transport_and_service_management_system;

public class Passenger {
    String passengerName;
    String passengerId;
    String passengerGender;
    int passengerAge;

    public Passenger(String PassengerName,String passengerId,String passengerGender,int passengerAge){
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
        this.passengerId = passengerId;
    }

    public void display(){
        System.out.println("Passenger Id : "+this.passengerId+", Passenger Name : "+this.passengerName+", Passenger Gender : "+this.passengerGender+", Passenger Age : "+this.passengerAge);
    }
}
