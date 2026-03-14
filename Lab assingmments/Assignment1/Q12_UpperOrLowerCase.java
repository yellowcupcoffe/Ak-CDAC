import java.util.Scanner;

public class Q12_UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        sc.close();
    }
}
