package junit.testing_parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenNumberTest {
    EvenNumber isEven = new EvenNumber();

    // This method is used to check the isEven method of EvenNumber class on even numbers
    @ParameterizedTest
    @ValueSource(ints = {2,4,6})
    void testEvenNumber(int num){
        assertTrue(isEven.isEven(num));
    }

    // This method is used to check the isEven method of EvenNumber class on odd numbers
    @ParameterizedTest
    @ValueSource(ints = {7,9})
    void testOddNumber(int num){
        assertFalse(isEven.isEven(num));
    }
}
