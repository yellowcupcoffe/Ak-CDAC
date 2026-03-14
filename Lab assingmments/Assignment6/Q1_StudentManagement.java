import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String course;
    int marks;

    Student(int studentId, String studentName, String course, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name: " + studentName + " | Course: " + course + " | Marks: " + marks;
    }
}

public class Q1_StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();
        students.add(new Student(id, name, course, marks));
        System.out.println("Student added successfully!");
    }

    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.studentId == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.studentId == id) {
                sc.nextLine();
                System.out.print("New Name: ");
                s.studentName = sc.nextLine();
                System.out.print("New Course: ");
                s.course = sc.nextLine();
                System.out.print("New Marks: ");
                s.marks = sc.nextInt();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentId == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void sortStudents() {
        Collections.sort(students, Comparator.comparingInt(s -> s.marks));
        System.out.println("Students sorted by marks.");
        displayAll();
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayAll(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: sortStudents(); break;
                case 7:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default: System.out.println("Invalid option!");
            }
        }
    }
}
