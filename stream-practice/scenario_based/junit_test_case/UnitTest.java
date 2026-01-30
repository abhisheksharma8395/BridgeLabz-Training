package junit_test_case;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UnitTest {
    Program program;

    @BeforeEach
    public void setUp(){
        program = new Program(1000.0);
    }

    @Test
    public void testDepositValidAmount() throws BankAccountException {
        program.deposit(3000.0);
        assertEquals(4000.0,program.balance,0.001);
    }

    @Test
    public void testDepositNegativeAmount() {
        assertThrows(BankAccountException.class,() -> program.deposit(-1000));
    }

    @Test
    public void testWithdrawValidAmount() throws BankAccountException {
        program.withdraw(750.0);
        assertEquals(250.0,program.balance,0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        assertThrows(BankAccountException.class,() -> program.withdraw(1200));
    }
}
