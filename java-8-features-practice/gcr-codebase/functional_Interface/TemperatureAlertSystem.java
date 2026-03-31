package functional_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current temperature : ");
        double temperature = scanner.nextDouble();
        Predicate<Double> threshold = (Double temp) -> temp > 37.5;
        if(threshold.test(temperature)){
            System.out.println("Alert : Temperature crossed the threshold temperature");
        }
        else{
            System.out.println("Temperature is normal");
        }
    }
}
