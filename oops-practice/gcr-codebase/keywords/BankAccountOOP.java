public class BankAccountOOP {
  
   // Static variable shared across all accounts
   private static String bankName = "State bank of India";              // Stores the Bank name which remains same for all the instance of BankAccountOOP
   private static int totalAccounts = 0;                               //   Stores the total Account Opened in this bank which remains same for all the instance of BankAccountOOP
   // Final variable to ensure account number cannot be changed once assigned
   private final String accountNumber;                                // Stores the account number of user
   private String accountHolderName;                                 // Stores the account holder name
   private double balance;                                           // Stores the balance in the account

   // Constructor of BankAccountOOP class
   public BankAccountOOP(String accountHolderName, String accountNumber, double balance) {
       this.accountHolderName = accountHolderName;
       this.accountNumber = accountNumber;  // Final variable assigned only once
       this.balance = balance;
       totalAccounts++;   // Increment total accounts with each new account
   }
   // Static method to get the total number of accounts
   public static void getTotalAccounts() {
       System.out.println("Total number of accounts: " + totalAccounts);
   }

   // Method to display account details
   public void displayAccountDetails() {
       // Using instanceof to check if the object is a BankAccount instance
       if (this instanceof BankAccountOOP) {
           System.out.println("Bank Name: " + bankName);
           System.out.println("Account Holder: " + accountHolderName);
           System.out.println("Account Number: " + accountNumber);
           System.out.println("Balance: $" + balance);
       } else {
           System.out.println("Invalid account instance.");
       }
   }

   // Getters and setters method for accountHolderName and Balance
   public String getAccountHolderName() {
       return accountHolderName;
   }
   public void setAccountHolderName(String accountHolderName) {
       this.accountHolderName = accountHolderName;
   }
   public double getBalance() {
       return balance;
   }

   // This Method is used to deposit the money in the account
   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Deposited: $" + amount);
       } else {
           System.out.println("Invalid deposit amount.");
       }
   }

   // This method is used to withdraw the amount from the account
   public void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawn: $" + amount);
       } else {
           System.err.println("Insufficient balance or invalid amount.");
       }
   }

   // Main method for testing the program
   public static void main(String[] args) {
       // Create the Object of BankAccountOOP class
       BankAccountOOP account1 = new BankAccountOOP("Lynda Princy", "ACC12345", 1000.00);
       BankAccountOOP account2 = new BankAccountOOP("Prince Danish", "ACC67890", 500.00);

       // Display account details
       System.out.println("\nAccount 1 Details:");
       account1.displayAccountDetails();
       System.out.println("\nAccount 2 Details:");
       account2.displayAccountDetails();

       // Check total accounts
       BankAccountOOP.getTotalAccounts();

       // Deposit and withdraw operations
       System.out.println("\nPerforming transactions on Account 1:");
       account1.deposit(200);
       account1.withdraw(150);
       account1.displayAccountDetails();
       System.out.println("\nPerforming transactions on Account 2:");
       account2.displayAccountDetails();
       account2.deposit(100);
       account2.withdraw(800);
   }
}
