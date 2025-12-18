import java.util.Scanner;
// Class CelsiusToFahrenheit
class CelsiusToFahrenheit{
    public static void main(String[] args){

        // Creating object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius degree : ");

        // Taking input of temperature in Celsius from user
        double celsiusDegree = sc.nextDouble();

        // Formula for calculating fahrenheit degree to celsius degree °F = °C × (9/5) + 32
        double FahrenheitDegree = (celsiusDegree*(9.0/5))+32;

        // Printing Result
        System.out.printf("Temperature of %.2f°C is equals to %.2f°F",celsiusDegree,FahrenheitDegree);
    }
}