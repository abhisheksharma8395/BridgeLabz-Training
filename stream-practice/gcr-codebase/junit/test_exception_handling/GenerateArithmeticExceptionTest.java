package junit.test_exception_handling;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class GenerateArithmeticExceptionTest {
    // Creating the object of GenerateArithmetic
    GenerateArithmeticException object = new GenerateArithmeticException();

    // Test case for divide method of GenerateArithmeticException with valid number
    @Test
    public void validNumbers(){
        assertEquals(4,object.divide(8,2));
        assertEquals(1,object.divide(8,8));
        assertEquals(18,object.divide(180,10));
        assertEquals(2,object.divide(12,5));
    }

    @Test
    public void divideByZero(){
        assertThrows(ArithmeticException.class, () -> object.divide(4,0));
    }


}
