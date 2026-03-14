import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    class Library {
        double getDiscountedPrice() {
            if (price > 1000) {
                double discount = price * 0.15;
                System.out.println("Discount (15%): Rs. " + discount);
                return price - discount;
            }
            return price;
        }

        void displayBook() {
            System.out.println("\n--- Book Details ---");
            System.out.println("Book ID  : " + bookId);
            System.out.println("Title    : " + title);
            System.out.println("Author   : " + author);
            System.out.println("Price    : Rs. " + price);
            System.out.println("Final Price: Rs. " + getDiscountedPrice());
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Book " + (i + 1) + " ---");
            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            books[i] = new Book(id, title, author, price);
        }

        System.out.println("\n========== LIBRARY CATALOGUE ==========");
        for (Book b : books) {
            Book.Library lib = b.new Library();
            lib.displayBook();
        }
        sc.close();
    }
}
