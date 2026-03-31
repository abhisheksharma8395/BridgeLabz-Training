package exceptions;

public class BankTransactionSystem {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("Abhishek", "BOB101");
            account1.deposit(500);
            account1.withdraw(300);
            account1.deposit(500);
            account1.withdraw(1000);
        }catch(InsufficientBalanceException e){
            System.out.println("Insufficient balance!");
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid amount!");
        }
    }
}


// Class BankAccount
class BankAccount{
    String accountHolderName;                                     // Stores the name of Account Holder Name
    String accountNumber;                                         // Stores the Account Number
    double balance = 0;                                           // Stores the balance in account
    // Constructor of BankAccount class to initialize variables
    public BankAccount(String accountHolderName,String accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
    }

    // This method is used to add money in the account
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Money "+amount+" Deposited Successfully in Account.");
    }

    // This method is used to withdraw money from the account
    public void withdraw(double amount) throws InsufficientBalanceException,IllegalArgumentException{
        if(amount>this.balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        else if(amount<0){
            throw new IllegalArgumentException();
        }
        else {
            this.balance -= amount;
            System.out.println("Withdrawal successful, new balance: "+this.balance);
        }
    }

}

// Custom Exception class InsufficientBalanceException
class InsufficientBalanceException extends Exception{
    // Constructor of InsufficientBalanceException class
    public InsufficientBalanceException(String message){
        super(message);
    }
}
