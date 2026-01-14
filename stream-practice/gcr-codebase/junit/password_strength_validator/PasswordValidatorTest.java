package junit.password_strength_validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest {
    // Object of PasswordValidator class
    PasswordValidator pwd = new PasswordValidator();

    // Parameterized test for checking method isValidPassword of class PasswordValidator on valid password input
    @ParameterizedTest
    @ValueSource (strings = {"Pa$$w0rd!","Pass123!","Strong@123","MyP@ssw0rd","Pa$$w0rd"})
    public void validTestcases(String password){
        assertTrue(pwd.isValidPassword(password));
    }

    // Parameterized test for checking method isValidPassword of class PasswordValidator on invalid password input
    @ParameterizedTest
    @ValueSource (strings = {"password","PASSWORD123","Pass123","Pa$$word"})
    public void invalidTestcases(String password){
        assertFalse(pwd.isValidPassword(password));
    }

}
