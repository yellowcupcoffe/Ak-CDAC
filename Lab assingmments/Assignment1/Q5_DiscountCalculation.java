import java.util.Scanner;

public class Q5_DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = price * discountPercent / 100;
        double finalPrice = price - discountAmount;

        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Final Price = " + finalPrice);
        sc.close();
    }
}
