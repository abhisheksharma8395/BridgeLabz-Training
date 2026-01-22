package JSONHandling;

import com.google.gson.Gson;

public class JavaObjectToJSON {
    public static void main(String[] args) {
        Car car1 = new Car("Tata","Nexon EV",2025,950000);
        Gson gson = new Gson();
        String json = gson.toJson(car1);
        System.out.println(json);
    }
}

// Car class
class Car{
    private String brand;                       // Stores the brand of car
    private String model;                       // Stores the model of car
    private int year;                           // Store the year of production of car
    private double price;                       // Store the car price

    // Constructor of Car class to initialize the instance variables
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}