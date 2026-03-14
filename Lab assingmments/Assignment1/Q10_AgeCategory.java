import java.util.Scanner;

public class Q10_AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid age entered.");
        }
        sc.close();
    }
}
