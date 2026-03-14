import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    class Transaction {
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
            System.out.println("Updated Balance: Rs. " + balance);
        }

        void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance! Available: Rs. " + balance);
            } else {
                balance -= amount;
                System.out.println("Withdrawn: Rs. " + amount);
                System.out.println("Updated Balance: Rs. " + balance);
            }
        }
    }

    void displayAccount() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);
        BankAccount.Transaction txn = account.new Transaction();
        boolean running = true;

        while (running) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Info");
            System.out.println("4. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    txn.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    txn.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayAccount();
                    break;
                case 4:
                    System.out.println("Thank you! Goodbye.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
