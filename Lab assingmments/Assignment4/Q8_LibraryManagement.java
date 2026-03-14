import java.util.Scanner;

class LibraryItem {
    int itemId;
    String title;

    LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    void displayItem() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
    }
}

class Book extends LibraryItem {
    String author;

    Book(int itemId, String title, String author) {
        super(itemId, title);
        this.author = author;
    }

    void displayAuthor() {
        displayItem();
        System.out.println("Type    : Book");
        System.out.println("Author  : " + author);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(int itemId, String title, int issueNumber) {
        super(itemId, title);
        this.issueNumber = issueNumber;
    }

    void displayIssueNumber() {
        displayItem();
        System.out.println("Type    : Magazine");
        System.out.println("Issue # : " + issueNumber);
    }
}

public class Q8_LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Item ID: ");
                    int bId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String bTitle = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    Book book = new Book(bId, bTitle, author);
                    System.out.println("\n--- Book Details ---");
                    book.displayAuthor();
                    break;
                case 2:
                    System.out.print("Item ID: ");
                    int mId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String mTitle = sc.nextLine();
                    System.out.print("Issue Number: ");
                    int issue = sc.nextInt();
                    Magazine mag = new Magazine(mId, mTitle, issue);
                    System.out.println("\n--- Magazine Details ---");
                    mag.displayIssueNumber();
                    break;
                case 3:
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
