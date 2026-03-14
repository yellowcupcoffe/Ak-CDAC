import java.util.Scanner;

public class Q11_SalaryWithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        double bonus;

        if (basicSalary >= 50000) {
            bonus = basicSalary * 0.20;
        } else if (basicSalary >= 30000) {
            bonus = basicSalary * 0.15;
        } else {
            bonus = basicSalary * 0.10;
        }

        double finalSalary = basicSalary + bonus;
        System.out.println("Bonus = " + bonus);
        System.out.println("Final Salary = " + finalSalary);
        sc.close();
    }
}
