package functional_Interface;

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        DieselCar car1 = new DieselCar(120);
        ElectricCar electricCar = new ElectricCar(80,50);
        car1.displaySpeed();
        electricCar.displaySpeed();
        electricCar.batteryPercentage();
    }
}



interface Vehicles{
    // Abstract method of Vehicle Interface
    void displaySpeed();

    // Default method
    default void batteryPercentage(){
        System.out.println("No Information available about battery percentage");
    }
}

class DieselCar implements Vehicles{
    int speed;                                    // It is used to store the speed
    // Constructor of class DieselCar to initialize the instance variables
    public DieselCar(int speed){
        this.speed = speed;
    }

    // Overriding the method to provide implementation of abstract method
    @Override
    public void displaySpeed() {
        System.out.println("The speed of this Diesel Car is "+this.speed+" km/h");
    }

}

class ElectricCar implements Vehicles{
    int speed;                                    // It is used to store the speed
    double battery;                               // It is used to store the battery remaining of the electric car

    // Constructor of class ElectricCar to initialize the instance variables
    public ElectricCar(int speed,double battery){
        this.speed = speed;
        this.battery = battery;
    }

    // Overriding the method to provide implementation of abstract method
    @Override
    public void displaySpeed() {
        System.out.println("The speed of this Electric Car is "+this.speed+" km/h");
    }

    @Override
    public void batteryPercentage(){
        System.out.printf("The battery remaining in electric car is : %.2f%% \n",this.battery);
    }

}
