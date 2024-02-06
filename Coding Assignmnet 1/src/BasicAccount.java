public class BasicAccount extends BaseAccount {
    private double withdrawalLimit;

    public BasicAccount(int accountNumber, double WithDrawlLimit) {
        super(accountNumber);
        this.withdrawalLimit = WithDrawlLimit; // Initialize with 0 or some default value
    }

    @Override
    public double Withdraw(double amount) {
        double actualWithdrawalAmount = Math.min(amount, withdrawalLimit); // Limit the withdrawal to the withdrawal limit or the balance, whichever is lower
        actualWithdrawalAmount = Math.min(actualWithdrawalAmount, balance); // Ensure it doesn't exceed the current balance

        balance -= actualWithdrawalAmount; // Deduct the actual withdrawal amount from the balance
        return actualWithdrawalAmount; // Return the amount that was actually withdrawn
    }
}