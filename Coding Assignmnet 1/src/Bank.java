import java.util.ArrayList;
import java.util.List;
import java.util.Optional; // For handling the possibility of an account not being found.

public class Bank implements IBank {
    private List<IAccount> accounts = new ArrayList<>();

    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    public void CloseAccount(int accountNumber) {
        Optional<IAccount> accountOptional = accounts.stream()
                .filter(a -> a.GetAccountNumber() == accountNumber)
                .findFirst();

        if (accountOptional.isPresent()) {
            IAccount account = accountOptional.get();
            if (account.GetCurrentBalance() >= 0) {
                accounts.remove(account);
            }
        }
    }

    public List<IAccount> GetAllAccounts() {
        return new ArrayList<>(accounts); // Return a copy of the accounts list
    }

    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> inDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                inDebt.add(account);
            }
        }
        return inDebt;
    }

    public List<IAccount> GetAllAccountsWithBalance(double minBalance) {
        List<IAccount> withBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > minBalance) {
                withBalance.add(account);
            }
        }
        return withBalance;
    }
}