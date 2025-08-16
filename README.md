# 🏦 Banking Management System (Java)

A **Java-based Banking Management System** built using **OOP** and **DSA**.  
It simulates account creation, deposits, withdrawals, fund transfers, transaction history, and balance sheet generation.

---

## 🚀 Features
- Create and manage accounts  
- Deposit & withdraw funds  
- Transfer money securely  
- Transaction history using ArrayList  
- Fast account lookup with HashMap  
- Generate account statements & bank balance sheet  

---

## 📂 Project Structure
src/
├── Account.java
├── Transaction.java
├── Bank.java
└── BankingApp.java
## ▶️ How It Runs

After compiling and running `BankingApp.java`, the console will show a menu like this:


=== Banking Management System ===
1. Create Account
2. Deposit
3. Withdraw
4. Transfer Funds
5. Generate Statement
6. Generate Balance Sheet
7. Exit
Example Run:
1. Create Account


Enter Choice: 1
Enter Account Number: 1001
Enter Holder Name: Alice
Enter Initial Deposit: 5000
✅ Account Created Successfully!
2. Deposit Money


Enter Choice: 2
Enter Account Number: 1001
Enter Deposit Amount: 2000
✅ Deposit Successful! New Balance: 7000
3. Transfer Funds

bash
Copy
Edit
Enter Choice: 4
From Account: 1001
To Account: 1002
Amount: 1500
✅ Transfer Successful!
4. Generate Balance Sheet


=== Bank Balance Sheet ===
Total Accounts: 2
Total Balance: 12,000
▶️ Run Instructions

# Compile the program
javac src/BankingApp.java

# Run the program
java -cp src BankingApp

