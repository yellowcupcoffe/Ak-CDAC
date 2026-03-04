package Java;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Amount successfully deposited.");
            new Transaction("DEPOSIT", amount);
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount successfully withdrawn.");
            new Transaction("WITHDRAW", amount);
        }
    }

    // Show Balance
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Inner Class
    class Transaction {
        private String transactionType;
        private double amount;

        public Transaction(String transactionType, double amount) {
            this.transactionType = transactionType;
            this.amount = amount;

            System.out.println("Transaction Recorded -> Type: " 
                    + transactionType + " | Amount: " + amount);
        }
    }
}