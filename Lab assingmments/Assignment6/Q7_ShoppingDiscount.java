import java.util.Scanner;

interface Discount {
    double calculateDiscount(double price);
}

class FestivalDiscount implements Discount {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20; // 20% discount
    }
}

class SeasonalDiscount implements Discount {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10; // 10% discount
    }
}

public class Q7_ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== ONLINE SHOPPING DISCOUNT SYSTEM =====");
            System.out.println("1. Festival Discount (20%)");
            System.out.println("2. Seasonal Discount (10%)");
            System.out.println("3. Exit");
            System.out.print("Select discount type: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting. Thank you!");
                running = false;
                continue;
            }

            System.out.print("Enter product price: Rs. ");
            double price = sc.nextDouble();
            Discount discount;

            switch (choice) {
                case 1:
                    discount = new FestivalDiscount();
                    double fd = discount.calculateDiscount(price);
                    System.out.println("[Festival Discount]");
                    System.out.println("Original Price : Rs. " + price);
                    System.out.println("Discount (20%) : Rs. " + fd);
                    System.out.println("Final Price    : Rs. " + (price - fd));
                    break;
                case 2:
                    discount = new SeasonalDiscount();
                    double sd = discount.calculateDiscount(price);
                    System.out.println("[Seasonal Discount]");
                    System.out.println("Original Price : Rs. " + price);
                    System.out.println("Discount (10%) : Rs. " + sd);
                    System.out.println("Final Price    : Rs. " + (price - sd));
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
