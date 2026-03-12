import java.io.*;
import java.util.Scanner;

public class StudentFileHandler {
    public static void main(String[] args) {
        String fileName = "students.txt";
        Scanner scanner = new Scanner(System.in);

        // 1. & 2. Accept names and write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter 5 student names:");
            for (int i = 0; i < 5; i++) {
                String name = scanner.nextLine();
                writer.write(name);
                writer.newLine(); // Adds a line break after each name
            }
            System.out.println("\nSuccessfully saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }

        // 3. & 4. Read from file and display
        System.out.println("\nReading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
        
        scanner.close();
    }
}