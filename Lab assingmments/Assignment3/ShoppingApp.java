import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    class Cart {
        double calculateBill() {
            double total = price * quantity;
            if (total > 5000) {
                double discount = total * 0.10;
                System.out.println("Subtotal     : Rs. " + total);
                System.out.println("Discount(10%): Rs. " + discount);
                total -= discount;
            }
            return total;
        }

        void displayBill() {
            System.out.println("\n--- Product Bill ---");
            System.out.println("Product ID   : " + productId);
            System.out.println("Product Name : " + productName);
            System.out.println("Price/Unit   : Rs. " + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Total Bill   : Rs. " + calculateBill());
        }
    }
}

public class ShoppingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Product " + (i + 1) + " ---");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            products[i] = new Product(id, name, price, qty);
        }

        System.out.println("\n========== SHOPPING BILL ==========");
        for (Product p : products) {
            Product.Cart cart = p.new Cart();
            cart.displayBill();
        }
        sc.close();
    }
}
