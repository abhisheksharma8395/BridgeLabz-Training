import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TemperatureConverterTest {

    // Creating Objects of TemperatureConverter class
    TemperatureConverter converter = new TemperatureConverter();

    // This test case is used to check celsiusToFahrenheit method on 0 degree Celsius
    @Test
    void testCelsiusToFahrenheitAtZero() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0),0.001);
    }

    // This test case is used to check celsiusToFahrenheit method on 100 degree Celsius
    @Test
    void testCelsiusToFahrenheitAtBoilingPoint() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100),0.001);
    }

    // This test case is used to check celsiusToFahrenheit method on -40 degree Celsius
    @Test
    void testCelsiusToFahrenheitSame() {
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40),0.001);
    }

    // This test case is used to check fahrenheitToCelsius method on 32 degree Fahrenheit
    @Test
    void testFahrenheitToCelsiusFreezingPoint() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32),0.001);
    }

    // This test case is used to check fahrenheitToCelsius method on 212 degree Fahrenheit
    @Test
    void testFahrenheitToCelsius_Boiling() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212),0.001);
    }

    // This test case is used to check fahrenheitToCelsius method on -40 degree Fahrenheit
    @Test
    void testFahrenheitToCelsiusSame() {
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40),0.001);
    }
}
