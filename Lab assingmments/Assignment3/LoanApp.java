import java.util.Scanner;

class Loan {
    double loanAmount;
    double interestRate;
    int loanTenure; // in years

    Loan(double loanAmount, double interestRate, int loanTenure) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTenure = loanTenure;
    }

    class EMICalculator {
        double calculateEMI() {
            // Simple Interest EMI = (Principal + SI) / (tenure * 12)
            double simpleInterest = (loanAmount * interestRate * loanTenure) / 100;
            double totalAmount = loanAmount + simpleInterest;
            double emi = totalAmount / (loanTenure * 12);
            return emi;
        }

        void displayEMI() {
            System.out.println("\n--- Loan EMI Details ---");
            System.out.println("Loan Amount    : Rs. " + loanAmount);
            System.out.println("Interest Rate  : " + interestRate + "%");
            System.out.println("Loan Tenure    : " + loanTenure + " years");
            double si = (loanAmount * interestRate * loanTenure) / 100;
            System.out.println("Simple Interest: Rs. " + si);
            System.out.println("Total Amount   : Rs. " + (loanAmount + si));
            System.out.println("Monthly EMI    : Rs. " + String.format("%.2f", calculateEMI()));
        }
    }
}

public class LoanApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of loan applications: ");
        int n = sc.nextInt();
        Loan[] loans = new Loan[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Loan " + (i + 1) + " ---");
            System.out.print("Loan Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Interest Rate (%): ");
            double rate = sc.nextDouble();
            System.out.print("Loan Tenure (years): ");
            int tenure = sc.nextInt();
            loans[i] = new Loan(amount, rate, tenure);
        }

        System.out.println("\n========== LOAN EMI REPORT ==========");
        for (Loan l : loans) {
            Loan.EMICalculator calc = l.new EMICalculator();
            calc.displayEMI();
        }
        sc.close();
    }
}
