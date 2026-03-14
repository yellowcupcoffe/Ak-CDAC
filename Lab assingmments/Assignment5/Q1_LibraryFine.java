import java.util.Scanner;

class LibraryFine {
    // Overloaded method 1: only late days
    double calculateFine(int lateDays) {
        return lateDays * 2.0; // default Rs. 2 per day
    }

    // Overloaded method 2: late days + fine per day
    double calculateFine(int lateDays, double finePerDay) {
        return lateDays * finePerDay;
    }

    // Overloaded method 3: late days + fine per day + optional penalty
    double calculateFine(int lateDays, double finePerDay, double penalty) {
        return (lateDays * finePerDay) + penalty;
    }
}

public class Q1_LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryFine lf = new LibraryFine();
        boolean running = true;

        while (running) {
            System.out.println("\n===== LIBRARY FINE CALCULATOR =====");
            System.out.println("1. Calculate Fine (late days only)");
            System.out.println("2. Calculate Fine (late days + fine/day)");
            System.out.println("3. Calculate Fine (late days + fine/day + penalty)");
            System.out.println("4. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter late days: ");
                    int days1 = sc.nextInt();
                    System.out.println("Fine = Rs. " + lf.calculateFine(days1));
                    break;
                case 2:
                    System.out.print("Enter late days: ");
                    int days2 = sc.nextInt();
                    System.out.print("Enter fine per day: ");
                    double fpd = sc.nextDouble();
                    System.out.println("Fine = Rs. " + lf.calculateFine(days2, fpd));
                    break;
                case 3:
                    System.out.print("Enter late days: ");
                    int days3 = sc.nextInt();
                    System.out.print("Enter fine per day: ");
                    double fpd2 = sc.nextDouble();
                    System.out.print("Enter additional penalty: ");
                    double penalty = sc.nextDouble();
                    System.out.println("Fine = Rs. " + lf.calculateFine(days3, fpd2, penalty));
                    break;
                case 4:
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
