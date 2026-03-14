import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : Rs. " + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod; // in months

    Electronics(int productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void displayWarrantyPeriod() {
        displayProduct();
        System.out.println("Type         : Electronics");
        System.out.println("Warranty     : " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    String sizeOptions;

    Clothing(int productId, String productName, double price, String sizeOptions) {
        super(productId, productName, price);
        this.sizeOptions = sizeOptions;
    }

    void displaySizeOptions() {
        displayProduct();
        System.out.println("Type         : Clothing");
        System.out.println("Size Options : " + sizeOptions);
    }
}

public class Q7_OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
            System.out.println("1. Add Electronics Product");
            System.out.println("2. Add Clothing Product");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Product ID: ");
                    int eId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Product Name: ");
                    String eName = sc.nextLine();
                    System.out.print("Price: ");
                    double ePrice = sc.nextDouble();
                    System.out.print("Warranty Period (months): ");
                    int warranty = sc.nextInt();
                    Electronics elec = new Electronics(eId, eName, ePrice, warranty);
                    System.out.println("\n--- Electronics Details ---");
                    elec.displayWarrantyPeriod();
                    break;
                case 2:
                    System.out.print("Product ID: ");
                    int cId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Product Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Price: ");
                    double cPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Size Options (e.g. S, M, L, XL): ");
                    String sizes = sc.nextLine();
                    Clothing cloth = new Clothing(cId, cName, cPrice, sizes);
                    System.out.println("\n--- Clothing Details ---");
                    cloth.displaySizeOptions();
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
