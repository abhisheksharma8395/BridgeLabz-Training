package com.org;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void additionTest(){
        Calculator calculator = new Calculator();
        assertEquals(18,calculator.add(12,6));
    }


    @Test
    public void subtractionTest(){
        Calculator calculator = new Calculator();
        assertEquals(20,calculator.subtract(36,16));
    }

    @Test
    public void multiplicationTest(){
        Calculator calculator = new Calculator();
        assertEquals(120,calculator.multiply(12,10));
    }

    @Test
    public void divisionTest(){
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.divide(72,9));
    }

    @Test
    public void denominatorIsZeroTest(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class,() -> calculator.divide(5,0));
    }
}
