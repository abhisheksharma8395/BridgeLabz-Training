public class TemperatureConverter {
    // This method is used to Convert the Temperature from celisus to Fahrenheit
    public double celsiusToFahrenheit(double celsius){
        return ((celsius)*(9.0/5))+32;
    }
    // This method is used to Convert the Temperature from Fahrenheit to celsius
    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit)-32)*(5.0/9);
    }
}
