import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    class Result {
        String getGrade() {
            if (marks >= 80) return "A";
            else if (marks >= 60) return "B";
            else if (marks >= 40) return "C";
            else return "Fail";
        }

        void displayResult() {
            System.out.println("\n--- Student Result ---");
            System.out.println("Roll No : " + rollNo);
            System.out.println("Name    : " + name);
            System.out.println("Marks   : " + marks);
            System.out.println("Grade   : " + getGrade());
        }
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            students[i] = new Student(roll, name, marks);
        }

        System.out.println("\n========== RESULTS ==========");
        for (Student s : students) {
            Student.Result r = s.new Result();
            r.displayResult();
        }
        sc.close();
    }
}
