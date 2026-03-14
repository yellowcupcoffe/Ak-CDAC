import java.util.Scanner;

class Account {
    String accountNumber;
    String customerName;

    Account(String accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    double balance;

    SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
        super(accountNumber, customerName);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        displayAccountInfo();
        System.out.println("Balance        : Rs. " + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Interest Earned: Rs. " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber, String customerName, double overdraftLimit) {
        super(accountNumber, customerName);
        this.overdraftLimit = overdraftLimit;
    }

    void displayOverdraftLimit() {
        displayAccountInfo();
        System.out.println("Overdraft Limit: Rs. " + overdraftLimit);
    }
}

public class Q4_HierarchicalBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    String sAccNo = sc.nextLine();
                    System.out.print("Customer Name: ");
                    String sName = sc.nextLine();
                    System.out.print("Balance: ");
                    double bal = sc.nextDouble();
                    System.out.print("Interest Rate (%): ");
                    double rate = sc.nextDouble();
                    SavingsAccount sa = new SavingsAccount(sAccNo, sName, bal, rate);
                    System.out.println("\n--- Savings Account Details ---");
                    sa.calculateInterest();
                    break;
                case 2:
                    System.out.print("Account Number: ");
                    String cAccNo = sc.nextLine();
                    System.out.print("Customer Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Overdraft Limit: ");
                    double limit = sc.nextDouble();
                    CurrentAccount ca = new CurrentAccount(cAccNo, cName, limit);
                    System.out.println("\n--- Current Account Details ---");
                    ca.displayOverdraftLimit();
                    break;
                case 3:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
