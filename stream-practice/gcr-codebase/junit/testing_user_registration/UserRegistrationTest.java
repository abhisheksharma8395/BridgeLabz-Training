package junit.testing_user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;

public class UserRegistrationTest {
    private UserRegistration register;

    @BeforeEach
    public void setUp(){
        register = new UserRegistration();
    }


    // Important note for future for me -> Use @ValueSource when Your test method takes a single parameter
    // and use @CscSource when your test method takes multiple parameters
    // Test case for validating the registerUser method of UserRegistration by valid details.
    @ParameterizedTest
    @CsvSource({
            "Abhishek, abc.cs22@gla.com, glAuniversity1!",
            "John, john.doe@example.com, Password123!",
            "Alice, alice@example.org, Test@1234",
            "Michael, michael.smith@gmail.com, StrongPass9@",
            "Sophia, sophia.jones@yahoo.com, MySecurePwd1#",
            "David, david_king@outlook.com, KingRulez7!",
            "Emma, emma.watson@mail.com, Watson#2024",
            "Lucas, lucas.brown@company.org, Brownie88$",
            "Olivia, olivia_green@school.edu, OliveTree5%",
            "Noah, noah_carter@service.net, CarterNet3&"
    })
    public void testValid(String username,String email,String password) throws IllegalArgumentException{
        assertTrue(register.registerUser(username,email,password));
    }

    // Test case for validating the registerUser method of UserRegistration by invalid details
    @ParameterizedTest
    @CsvSource ({
            "Abhishek, not-an-email, glA university1!",
            "John, john.doe@example, Password123!",
            "Alice, alice@.org, Test@1234",
            "Michael, michael.smith@gmail.com, short",
            "Sophia, '', MySecurePwd1#",
            "David, david_king@outlook, KingRulez7!",
            "Emma, emma.watson@mail..com, Watson#2024",
            "Lucas, lucas.brown@company.org, ''",
            "Noah, @service.net, CarterNet3&",
            "Mia, mia.taylor@domain.dev, dev"
    })

    public void testInvalid(String username,String email,String password) throws IllegalArgumentException{
        UserRegistration register = new UserRegistration();
        assertThrows(IllegalArgumentException.class,() -> register.registerUser(username,email,password));
    }
}
