package functional_interface;

public class MultiVehicleRentalSystem {
    public static void main(String[] args) {
        // Creating the objects of UPI, CreditCard, Wallet class
        Car car = new Car(5,200);
        Bike bike = new Bike(7,50);
        Bus bus = new Bus(2,500);

        // Invoking the interface methods for each object
        car.rent();
        car.pay(50);
        car.returnVehicle();

        bike.rent();
        bike.pay(350);
        bike.returnVehicle();

        bus.rent();
        bus.pay(2000);
        bus.returnVehicle();

    }
}

// interface RentalInterface
interface RentalInterface {
    void rent();

    void pay(double amount);

    void returnVehicle();
}

// Car class implementing the interface RentalInterface
class Car implements RentalInterface {

    int totalRentDays;                               // Stores the total days for which vehicle is rented
    double totalRent;                                   // Stores the total rupees for all days

    // Constructor of Car class to initialize the instance variable
    public Car(int totalRentDays, int rentOneDay) {
        this.totalRentDays = totalRentDays;
        this.totalRent = this.totalRentDays * this.rent(rentOneDay);
    }

    // pay method to pay the rent
    @Override
    public void pay(double amount) {
        if (amount > totalRent) {
            System.out.println("Your amount is bigger than the rent. payment failed");
            System.out.println("Your rent is only " + this.totalRent);
        } else if (amount < totalRent){
            System.out.println("Your payment of "+amount+" is successful ");
            this.totalRent -= amount;
            System.out.println("Your Remaining rent is "+totalRent);
        }
        else{
            this.totalRent -= amount;
            System.out.println("You payed your all rent dues successfully.");
        }
    }

    @Override
    // this method tells your rent due
    public void rent() {
        System.out.println("Your rent is currently "+totalRent);
    }

    // This method is used to return the vehicle
    @Override
    public void returnVehicle() {
        if(this.totalRent == 0) {
            System.out.println("Car is returned");
        }
        else{
            System.out.println("Please pay all your due rent to return the vehicle");
        }
    }

    // this method return your single day rent of vehicle
    public double rent(double rentOneDay) {
        return rentOneDay;
    }
}

// Bike class implementing the interface RentalInterface
class Bike implements RentalInterface {

    int totalRentDays;                               // Stores the total days for which vehicle is rented
    double totalRent;                                   // Stores the total rupees for all days

    // Constructor of Car class to initialize the instance variable
    public Bike(int totalRentDays, int rentOneDay) {
        this.totalRentDays = totalRentDays;
        this.totalRent = this.totalRentDays * this.rent(rentOneDay);
    }

    // pay method to pay the rent
    @Override
    public void pay(double amount) {
        if (amount > totalRent) {
            System.out.println("Your amount is bigger than the rent. payment failed");
            System.out.println("Your rent is only " + this.totalRent);
        } else if (amount < totalRent){
            System.out.println("Your payment of "+amount+" is successful ");
            this.totalRent -= amount;
            System.out.println("Your Remaining rent is "+totalRent);
        }
        else{
            this.totalRent -= amount;
            System.out.println("You payed your all rent dues successfully.");
        }
    }

    @Override
    // this method tells your rent due
    public void rent() {
        System.out.println("Your rent is currently "+totalRent);
    }

    // This method is used to return the vehicle
    @Override
    public void returnVehicle() {
        if(this.totalRent == 0) {
            System.out.println("Bike is returned");
        }
        else{
            System.out.println("Please pay all your due rent to return the vehicle");
        }
    }

    // this method return your single day rent of vehicle
    public double rent(double rentOneDay) {
        return rentOneDay;
    }
}

// Car class implementing the interface RentalInterface
class Bus implements RentalInterface {

    int totalRentDays;                               // Stores the total days for which vehicle is rented
    double totalRent;                                   // Stores the total rupees for all days

    // Constructor of Car class to initialize the instance variable
    public Bus(int totalRentDays, int rentOneDay) {
        this.totalRentDays = totalRentDays;
        this.totalRent = this.totalRentDays * this.rent(rentOneDay);
    }

    // pay method to pay the rent
    @Override
    public void pay(double amount) {
        if (amount > totalRent) {
            System.out.println("Your amount is bigger than the rent. payment failed");
            System.out.println("Your rent is only " + this.totalRent);
        } else if (amount < totalRent){
            System.out.println("Your payment of "+amount+" is successful ");
            this.totalRent -= amount;
            System.out.println("Your Remaining rent is "+totalRent);
        }
        else{
            this.totalRent -= amount;
            System.out.println("You payed your all rent dues successfully.");
        }
    }

    @Override
    // this method tells your rent due
    public void rent() {
        System.out.println("Your rent is currently "+totalRent);
    }

    // This method is used to return the vehicle
    @Override
    public void returnVehicle() {
        if(this.totalRent == 0) {
            System.out.println("Bus is returned");
        }
        else{
            System.out.println("Please pay all your due rent to return the vehicle");
        }
    }

    // this method return your single day rent of vehicle
    public double rent(double rentOneDay) {
        return rentOneDay;
    }
}
