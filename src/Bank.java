// Bank.java
import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public boolean createAccount(String accNum, String name, double deposit) {
        if (accounts.containsKey(accNum)) return false;
        accounts.put(accNum, new Account(accNum, name, deposit));
        return true;
    }

    public Account getAccount(String accNum) {
        return accounts.get(accNum);
    }

    public boolean transfer(String fromAcc, String toAcc, double amount) {
        Account sender = accounts.get(fromAcc);
        Account receiver = accounts.get(toAcc);

        if (sender == null || receiver == null) return false;
        if (!sender.withdraw(amount)) return false;

        receiver.deposit(amount);
        return true;
    }

    public void generateStatement(String accNum) {
        Account acc = accounts.get(accNum);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        System.out.println("\n--- Statement for " + acc.getHolderName() + " ---");
        for (Transaction t : acc.getTransactions()) {
            System.out.println(t);
        }
        System.out.println("Final Balance: ₹" + acc.getBalance());
    }

    public void generateBalanceSheet() {
        System.out.println("\n--- Bank Balance Sheet ---");
        double total = 0;
        for (Account acc : accounts.values()) {
            System.out.println(acc.getAccountNumber() + " | " + acc.getHolderName() +
                    " | Balance: ₹" + acc.getBalance());
            total += acc.getBalance();
        }
        System.out.println("Total Bank Holdings: ₹" + total);
    }
}
