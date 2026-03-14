import java.util.Scanner;

public class Q6_PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println(name + " - Pass");
        } else {
            System.out.println(name + " - Fail");
        }
        sc.close();
    }
}
