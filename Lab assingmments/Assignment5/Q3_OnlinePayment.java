import java.util.Scanner;

class PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends PaymentGateway {
    @Override
    void processPayment(double amount) {
        double surcharge = amount * 0.02;
        System.out.println("[Credit Card] Payment of Rs. " + amount);
        System.out.println("Surcharge (2%): Rs. " + surcharge);
        System.out.println("Total Charged: Rs. " + (amount + surcharge));
    }
}

class UPIPayment extends PaymentGateway {
    @Override
    void processPayment(double amount) {
        System.out.println("[UPI] Payment of Rs. " + amount);
        System.out.println("No extra charges. Direct bank transfer.");
        System.out.println("Total Charged: Rs. " + amount);
    }
}

class NetBankingPayment extends PaymentGateway {
    @Override
    void processPayment(double amount) {
        double fee = 15.0;
        System.out.println("[Net Banking] Payment of Rs. " + amount);
        System.out.println("Transaction Fee: Rs. " + fee);
        System.out.println("Total Charged: Rs. " + (amount + fee));
    }
}

public class Q3_OnlinePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== ONLINE PAYMENT SYSTEM =====");
            System.out.println("1. Credit Card Payment");
            System.out.println("2. UPI Payment");
            System.out.println("3. Net Banking Payment");
            System.out.println("4. Exit");
            System.out.print("Select payment method: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting. Thank you!");
                running = false;
                continue;
            }

            System.out.print("Enter payment amount: Rs. ");
            double amount = sc.nextDouble();
            PaymentGateway pg;

            switch (choice) {
                case 1:
                    pg = new CreditCardPayment();
                    pg.processPayment(amount);
                    break;
                case 2:
                    pg = new UPIPayment();
                    pg.processPayment(amount);
                    break;
                case 3:
                    pg = new NetBankingPayment();
                    pg.processPayment(amount);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
