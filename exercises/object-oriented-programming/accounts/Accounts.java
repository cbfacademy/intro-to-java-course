public class Accounts {

    // Instance variables
    private int accountNumber;
    protected double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
    // Deposit method
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }
        
    // Withdrawal method
    public double withdraw(double requested) {
        if (requested > 0 && requested <= balance) {
            balance -= requested;
        }
        return 0;
    }
    }

