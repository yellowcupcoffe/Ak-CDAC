import java.util.Scanner;

public class Q8_LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is the largest.");
        } else if (b > a) {
            System.out.println(b + " is the largest.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}
