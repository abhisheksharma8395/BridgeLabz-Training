package junit_test_case;


public class Program {
    double balance;                            // Stores the current balance of the account

    // Constructor of Program class to initialize the instance variables
    public Program(double balance){
        this.balance = balance;
    }

    // This method is used to deposit the amount to account
    public void deposit(double amount) throws BankAccountException {
        if(amount < 0.0){
            throw new BankAccountException("Deposit Amount cannot be negative");
        }
        this.balance += amount;
        System.out.println("Amount "+amount+" added to your back account successfully");
    }

    // This method is used to withdraw the amount from account
    public void withdraw(double amount) throws BankAccountException {
        if(amount > this.balance){
            throw new BankAccountException("Insufficient funds");
        }
        this.balance -= amount;
        System.out.println("Amount "+amount+" withdrawn from your back account successfully");
    }
}

class BankAccountException extends Exception{
    public BankAccountException(String message){
        super(message);
    }
}
