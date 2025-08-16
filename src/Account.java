// Account.java
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private String holderName;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialDeposit;
        this.transactions = new ArrayList<>();
        addTransaction("Account Created", initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposit", amount);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        addTransaction("Withdrawal", amount);
        return true;
    }

    private void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount, balance));
    }
}
