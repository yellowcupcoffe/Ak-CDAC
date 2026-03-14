import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

class Exam extends Student {
    int mark1;
    int mark2;

    Exam(int rollNo, String name, int mark1, int mark2) {
        super(rollNo, name);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    void displayMarks() {
        displayStudent();
        System.out.println("Mark 1  : " + mark1);
        System.out.println("Mark 2  : " + mark2);
    }
}

class Result extends Exam {
    Result(int rollNo, String name, int mark1, int mark2) {
        super(rollNo, name, mark1, mark2);
    }

    int calculateTotal() {
        return mark1 + mark2;
    }

    void displayResult() {
        displayMarks();
        System.out.println("Total   : " + calculateTotal());
        System.out.println("Average : " + (calculateTotal() / 2.0));
    }
}

public class Q3_MultilevelStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Result[] results = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Mark 1: ");
            int m1 = sc.nextInt();
            System.out.print("Mark 2: ");
            int m2 = sc.nextInt();
            results[i] = new Result(roll, name, m1, m2);
        }

        System.out.println("\n========== STUDENT RESULTS ==========");
        for (Result r : results) {
            System.out.println();
            r.displayResult();
        }
        sc.close();
    }
}
