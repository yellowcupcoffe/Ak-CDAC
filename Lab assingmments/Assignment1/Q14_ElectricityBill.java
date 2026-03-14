import java.util.Scanner;

public class Q14_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of electricity units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total Electricity Bill = Rs. " + bill);
        sc.close();
    }
}
