import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    int patientId;
    String patientName;
    String disease;

    Patient(int patientId, String patientName, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "ID: " + patientId + " | Name: " + patientName + " | Disease: " + disease;
    }
}

public class Q3_HospitalQueue {
    public static void main(String[] args) {
        Queue<Patient> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== HOSPITAL PATIENT QUEUE =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Serve Patient (Remove First)");
            System.out.println("3. Display Next Patient");
            System.out.println("4. Display All Patients");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Disease: ");
                    String disease = sc.nextLine();
                    queue.add(new Patient(id, name, disease));
                    System.out.println("Patient added to queue.");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        Patient served = queue.poll();
                        System.out.println("Serving patient: " + served);
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        System.out.println("Next Patient: " + queue.peek());
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("--- Patient Queue ---");
                        int pos = 1;
                        for (Patient p : queue) {
                            System.out.println(pos++ + ". " + p);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
