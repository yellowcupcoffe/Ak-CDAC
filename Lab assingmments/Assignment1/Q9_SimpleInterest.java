import java.util.Scanner;

public class Q9_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        int time = sc.nextInt();

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
        if (si > 10000) {
            System.out.println("Interest is HIGH");
        } else {
            System.out.println("Interest is LOW");
        }
        sc.close();
    }
}
