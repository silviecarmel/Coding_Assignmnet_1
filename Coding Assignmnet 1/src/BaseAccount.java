// Base class for all account types
public abstract class BaseAccount implements IAccount {
    protected int accountNumber;
    protected double balance;

    // Constructor for BaseAccount
    public BaseAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Deposit method
    public void Deposit(double amount) {
        balance += amount;
    }

    // Get current balance
    public double GetCurrentBalance() {
        return balance;
    }

    // Get account number
    public int GetAccountNumber() {
        return accountNumber;
    }
}