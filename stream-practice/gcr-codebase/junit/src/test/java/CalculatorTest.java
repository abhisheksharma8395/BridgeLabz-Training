import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    // Test case for checking the add method of calculator class
    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    // Test case for checking the subtract method of calculator class
    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    // Test case for checking the multiply method of calculator class
    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    // Test case for checking the divide method of calculator class
    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }
    // Test case for when DivideByZero occurs
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}