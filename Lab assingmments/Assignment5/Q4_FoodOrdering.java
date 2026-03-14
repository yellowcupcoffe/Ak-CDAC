import java.util.Scanner;

class FoodOrder {
    void calculateBill(double price) {
        System.out.println("Base Bill: Rs. " + price);
    }
}

class DineInOrder extends FoodOrder {
    @Override
    void calculateBill(double price) {
        double serviceCharge = price * 0.10;
        double gst = price * 0.05;
        double total = price + serviceCharge + gst;
        System.out.println("[Dine-In Order]");
        System.out.println("Base Price       : Rs. " + price);
        System.out.println("Service Charge(10%): Rs. " + serviceCharge);
        System.out.println("GST (5%)         : Rs. " + gst);
        System.out.println("Total Bill       : Rs. " + total);
    }
}

class TakeAwayOrder extends FoodOrder {
    @Override
    void calculateBill(double price) {
        double packagingCharge = 30.0;
        double total = price + packagingCharge;
        System.out.println("[Take-Away Order]");
        System.out.println("Base Price       : Rs. " + price);
        System.out.println("Packaging Charge : Rs. " + packagingCharge);
        System.out.println("Total Bill       : Rs. " + total);
    }
}

class HomeDeliveryOrder extends FoodOrder {
    @Override
    void calculateBill(double price) {
        double deliveryCharge = 50.0;
        double gst = price * 0.05;
        double total = price + deliveryCharge + gst;
        System.out.println("[Home Delivery Order]");
        System.out.println("Base Price       : Rs. " + price);
        System.out.println("Delivery Charge  : Rs. " + deliveryCharge);
        System.out.println("GST (5%)         : Rs. " + gst);
        System.out.println("Total Bill       : Rs. " + total);
    }
}

public class Q4_FoodOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== FOOD ORDERING SYSTEM =====");
            System.out.println("1. Dine-In Order");
            System.out.println("2. Take-Away Order");
            System.out.println("3. Home Delivery Order");
            System.out.println("4. Exit");
            System.out.print("Select order type: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting. Thank you!");
                running = false;
                continue;
            }

            System.out.print("Enter food price: Rs. ");
            double price = sc.nextDouble();
            FoodOrder order;

            switch (choice) {
                case 1:
                    order = new DineInOrder();
                    order.calculateBill(price);
                    break;
                case 2:
                    order = new TakeAwayOrder();
                    order.calculateBill(price);
                    break;
                case 3:
                    order = new HomeDeliveryOrder();
                    order.calculateBill(price);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
