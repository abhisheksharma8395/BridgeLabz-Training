public class BankAccount {
    double amount;                            // Stores the amount present in account

    // Constructor of BankAccount class to initialize the amount instance variable
    public BankAccount(double amount) {
        this.amount = amount;
    }

    // By using this method we can add money in the account
    public double deposit(double amount){
        this.amount += amount;
        return this.amount;
    }

    // By using this method we can add money in the account
    public double withdraw(double amount) throws Exception {
        if(amount > this.amount){
            throw new Exception("Insufficient balance");
        }
        this.amount -= amount;
        return this.amount;
    }

    // By using this method we can get the current balance
    public double getBalance(){
        return this.amount;
    }
}
