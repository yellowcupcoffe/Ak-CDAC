import java.util.Scanner;

class ElectricityConnection {
    int consumerId;
    String consumerName;
    int unitsConsumed;

    ElectricityConnection(int consumerId, String consumerName, int unitsConsumed) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    class BillCalculator {
        double calculateBill() {
            double bill = 0;
            if (unitsConsumed <= 100) {
                bill = unitsConsumed * 5;
            } else if (unitsConsumed <= 200) {
                bill = (100 * 5) + ((unitsConsumed - 100) * 7);
            } else {
                bill = (100 * 5) + (100 * 7) + ((unitsConsumed - 200) * 10);
            }
            return bill;
        }

        void displayBill() {
            System.out.println("\n--- Electricity Bill ---");
            System.out.println("Consumer ID   : " + consumerId);
            System.out.println("Consumer Name : " + consumerName);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Total Bill    : Rs. " + calculateBill());
        }
    }
}

public class ElectricityApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of consumers: ");
        int n = sc.nextInt();
        ElectricityConnection[] connections = new ElectricityConnection[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Consumer " + (i + 1) + " ---");
            System.out.print("Consumer ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Consumer Name: ");
            String name = sc.nextLine();
            System.out.print("Units Consumed: ");
            int units = sc.nextInt();
            connections[i] = new ElectricityConnection(id, name, units);
        }

        System.out.println("\n========== ELECTRICITY BILLS ==========");
        for (ElectricityConnection ec : connections) {
            ElectricityConnection.BillCalculator calc = ec.new BillCalculator();
            calc.displayBill();
        }
        sc.close();
    }
}
