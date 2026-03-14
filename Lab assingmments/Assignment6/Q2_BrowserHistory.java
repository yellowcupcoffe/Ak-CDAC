import java.util.Scanner;
import java.util.Stack;

public class Q2_BrowserHistory {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== BROWSER HISTORY (Stack) =====");
            System.out.println("1. Visit Page (Push)");
            System.out.println("2. Go Back (Pop)");
            System.out.println("3. Display Current Page (Top)");
            System.out.println("4. Display Full History");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL to visit: ");
                    String url = sc.nextLine();
                    history.push(url);
                    System.out.println("Visited: " + url);
                    break;
                case 2:
                    if (history.isEmpty()) {
                        System.out.println("No history to go back to!");
                    } else {
                        String removed = history.pop();
                        System.out.println("Went back from: " + removed);
                        if (!history.isEmpty()) {
                            System.out.println("Current page: " + history.peek());
                        } else {
                            System.out.println("No more pages in history.");
                        }
                    }
                    break;
                case 3:
                    if (history.isEmpty()) {
                        System.out.println("No pages in history.");
                    } else {
                        System.out.println("Current Page: " + history.peek());
                    }
                    break;
                case 4:
                    if (history.isEmpty()) {
                        System.out.println("History is empty.");
                    } else {
                        System.out.println("--- Browser History ---");
                        for (int i = history.size() - 1; i >= 0; i--) {
                            System.out.println((history.size() - i) + ". " + history.get(i));
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
