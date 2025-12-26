// Loanable Interface
interface LoanAble {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstract BankAccount Class
abstract class BankingAccountDetails {
    private String accountNumber;                          // Stores the Account number
    private String holderName;                             // Stores the account holder name
    private double balance;                                // Stores the remaining balance in the account

    // Constructor of BankingAccountDetails
    public BankingAccountDetails(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Concrete withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    // Show account details
    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Getters and setters methods (performing encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// SavingAccount subclass of BankingAccountDetails also implementing the LoanAble interface
class SavingsAccount extends BankingAccountDetails implements LoanAble {

    // Constructor of SavingsAccount class
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Calculates the interest on the balance for saving account
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    // By using this method user can apply for loan
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account.");
    }

    // This method check if the user met the eligibility to apply for loan or not
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// CurrentAccount subclass of BankingAccountDetails also implementing the LoanAble interface
class CurrentAccount extends BankingAccountDetails implements LoanAble {

    // Constructor of CurrentAccount class
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Calculates the interest on the balance for current account
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    // By using this method user can apply for loan
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account.");
    }

    // This method check if the user met the eligibility to apply for loan
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        // Creating the Object array of class BankingAccountDetails
        BankingAccountDetails[] accounts = new BankingAccountDetails[2];
        accounts[0] = new SavingsAccount("SB1001", "Virat Kohli", 18000);
        accounts[1] = new CurrentAccount("CA2001", "Novak Djokovic", 15000);

        for (BankingAccountDetails account : accounts) {
            account.showDetails();
            account.deposit(1000);
            account.withdraw(500);
            System.out.println("Interest Earned: ₹" + account.calculateInterest());

            // Polymorphic use of Loanable
            if (account instanceof LoanAble) {
                LoanAble loan = (LoanAble) account;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + (loan.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }

            System.out.println("--------------------------------------------");
        }
    }
}
