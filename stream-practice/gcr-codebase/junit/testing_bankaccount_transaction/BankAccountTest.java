package junit.testing_bankaccount_transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    // private reference variable of BankAccount class
    private BankAccount bankAccount;

    // This method runs before each testcase
    @BeforeEach
    public void setup(){
        bankAccount = new BankAccount(1000);
    }

    // This method will test the deposit method of BankAccount class
    @Test
    public void testDepositMethod(){
        assertEquals(3000.0,bankAccount.deposit(2000),0.001);
    }

    // This testcase is used to check the withdraw method of BankAccount class.
    @Test
    public void testWithdrawMethod() throws Exception{
        assertEquals(300.0,bankAccount.withdraw(700),0.001);
    }
}
