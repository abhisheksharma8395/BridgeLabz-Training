// Main class to test different bank account types
public class BankAccountTypes {
    public static void main(String[] args) {
    	
    	// Creating the object of SavingsAccounts , CheckingAccount , FixedDepositAccount .
        SavingsAccounts savingAccountObject = new SavingsAccounts("SA123", 15000.50, 3.5);   
        CheckingAccount checkingAccountObject = new CheckingAccount("CA123", 5000.00, 2000.00);
        FixedDepositAccount fixedDepositAccountObject = new FixedDepositAccount("FD123", 100000.00, 6.5, 12);

        System.out.println("\n--- Savings Account Info ---");
        savingAccountObject.showInfo();

        System.out.println("\n--- Checking Account Info ---");
        checkingAccountObject.showInfo();

        System.out.println("\n--- Fixed Deposit Account Info ---");
        fixedDepositAccountObject.showInfo();
    }
}

// Base class for all account types
class BankAccounts {
    private String accountNumber;                                       // Stores the Account number 
    private double balance;                                             // Stores the balance of Account

    // Constructor of BankAccounts class
    public BankAccounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method to display account info
    public void showInfo() {
        System.out.println("=========== Account Details ===========");
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("\nBalance: %.2f₹",balance);
    }
}

// Subclass Savings Account of BankAccounts
class SavingsAccounts extends BankAccounts {
    double interestRate;                                                                 // Stores the interest rate for saving account

    // Constructor of SavingsAccounts class
    public SavingsAccounts(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nInterest Rate : %.2f%%",interestRate);
    }
}

// Subclass CheckingAccount of BankAccounts
class CheckingAccount extends BankAccounts {
    double withdrawalLimit;                                                               // Stores the withdrawal limit
 
    // Constructor of CheckingAccounts class
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\\nWithdrawal Limit: %.2f₹" , withdrawalLimit);
    }
}

// Subclass FixedDepositAccount of BankAccounts
class FixedDepositAccount extends BankAccounts {
    double interestRate;                                                      // Stores the interest rate for saving account
    int maturityPeriod;                                                       // Stores the Maturity period of fixed Deposit Account in months

    // Subclass FixedDepositAccount of BankAccounts
    public FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("Interest Rate: %.2f%%",interestRate);
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
