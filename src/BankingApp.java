// BankingApp.java (Main class)
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Banking Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Funds");
            System.out.println("5. Generate Statement");
            System.out.println("6. Generate Balance Sheet");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double deposit = sc.nextDouble();
                    if (bank.createAccount(accNum, name, deposit))
                        System.out.println("✅ Account Created Successfully!");
                    else
                        System.out.println("❌ Account Already Exists!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    Account acc = bank.getAccount(accNum);
                    if (acc != null) {
                        acc.deposit(amt);
                        System.out.println("✅ Deposit Successful!");
                    } else {
                        System.out.println("❌ Account Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    amt = sc.nextDouble();
                    acc = bank.getAccount(accNum);
                    if (acc != null && acc.withdraw(amt))
                        System.out.println("✅ Withdrawal Successful!");
                    else
                        System.out.println("❌ Insufficient Balance or Invalid Account!");
                    break;

                case 4:
                    System.out.print("From Account: ");
                    String from = sc.nextLine();
                    System.out.print("To Account: ");
                    String to = sc.nextLine();
                    System.out.print("Amount: ");
                    amt = sc.nextDouble();
                    if (bank.transfer(from, to, amt))
                        System.out.println("✅ Transfer Successful!");
                    else
                        System.out.println("❌ Transfer Failed!");
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextLine();
                    bank.generateStatement(accNum);
                    break;

                case 6:
                    bank.generateBalanceSheet();
                    break;

                case 7:
                    System.out.println("👋 Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid Option! Try Again.");
            }
        }
    }
}
