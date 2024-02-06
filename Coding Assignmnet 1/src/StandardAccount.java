public class StandardAccount extends BaseAccount {
    private double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = creditLimit > 0 ? 0 : creditLimit; // Ensure credit limit is negative or zero
    }

    @Override
    public double Withdraw(double amount) {
        double maxWithdrawal = balance - creditLimit; // Maximum that can be withdrawn
        double actualWithdrawal = Math.min(amount, maxWithdrawal);
        balance -= actualWithdrawal;
        return actualWithdrawal;
    }
}