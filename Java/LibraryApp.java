package cdac;

public class LibraryApp {

    public static void main(String[] args) {

        Date date = InputHelper.readDate();

        System.out.println("\n--- Enter Book Details ---");
        Book book = InputHelper.readBook(date);
        book.calculateFine();
        book.display();

        System.out.println("\n--- Enter Magazine Details ---");
        Magazine magazine = InputHelper.readMagazine(date);
        magazine.calculateFine();
        magazine.display();
    }
}