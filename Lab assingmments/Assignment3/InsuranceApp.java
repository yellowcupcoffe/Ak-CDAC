import java.util.Scanner;

class PolicyHolder {
    int policyNumber;
    String name;
    int age;
    double sumAssured;

    PolicyHolder(int policyNumber, String name, int age, double sumAssured) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.age = age;
        this.sumAssured = sumAssured;
    }

    class PremiumCalculator {
        double calculatePremium() {
            double rate;
            if (age < 30) {
                rate = 0.02;
            } else if (age <= 50) {
                rate = 0.03;
            } else {
                rate = 0.05;
            }
            return sumAssured * rate;
        }

        void displayPremium() {
            System.out.println("\n--- Insurance Premium ---");
            System.out.println("Policy Number : " + policyNumber);
            System.out.println("Name          : " + name);
            System.out.println("Age           : " + age);
            System.out.println("Sum Assured   : Rs. " + sumAssured);
            System.out.println("Annual Premium: Rs. " + calculatePremium());
        }
    }
}

public class InsuranceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of policy holders: ");
        int n = sc.nextInt();
        PolicyHolder[] holders = new PolicyHolder[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Policy Holder " + (i + 1) + " ---");
            System.out.print("Policy Number: ");
            int pNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Sum Assured: ");
            double sum = sc.nextDouble();
            holders[i] = new PolicyHolder(pNo, name, age, sum);
        }

        System.out.println("\n========== INSURANCE PREMIUMS ==========");
        for (PolicyHolder ph : holders) {
            PolicyHolder.PremiumCalculator calc = ph.new PremiumCalculator();
            calc.displayPremium();
        }
        sc.close();
    }
}
