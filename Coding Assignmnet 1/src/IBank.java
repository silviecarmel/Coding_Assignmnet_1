import java.util.List;

public interface IBank {
    // Method to open a new account and add it to the bank's list of accounts
    void OpenAccount(IAccount account);

    // Method to close an account identified by its account number, considering the balance
    void CloseAccount(int accountNumber);

    // Method to get a list of all accounts in the bank
    List<IAccount> GetAllAccounts();

    // Method to get a list of all accounts with a negative balance
    List<IAccount> GetAllAccountsInDebt();

    // Method to get a list of all accounts with a balance greater than a specified amount
    List<IAccount> GetAllAccountsWithBalance(double balanceThreshold);
}