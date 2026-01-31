package stream_api.iot_sensor_reading;

import java.util.Arrays;
import java.util.List;

public class IOTSensorReading {
    public static void main(String[] args) {
        List<Double> sensorReadings = Arrays.asList(
                22.5, 30.2, 18.9, 45.0, 27.8, 50.6
        );

        double threshold = 30.0;
        System.out.println("Sensor Reading Above Threshlod are : ");
        sensorReadings.stream().filter(sensorReading -> sensorReading > 30.0).toList().forEach(System.out::println);
    }
}
