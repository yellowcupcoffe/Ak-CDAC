package cdac;

import java.util.Scanner;

public class InputHelper {

    private static Scanner sc = new Scanner(System.in);

    public static Date readDate() {

        System.out.print("Enter Day: ");
        String day = sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        return new Date(day, date);
    }

    public static Book readBook(Date date) {

        int id = readInt("Enter Item ID: ");
        String title = readString("Enter Title: ");
        int pages = readInt("Enter Number of Pages: ");
        String genre = readString("Enter Genre: ");
        double price = readDouble("Enter Price: ");
        int issue = readInt("Enter Issue Number: ");
        String author = readString("Enter Author: ");

        return new Book(id, title, pages, genre, price, issue, date, author);
    }

    public static Magazine readMagazine(Date date) {

        int id = readInt("Enter Item ID: ");
        String title = readString("Enter Title: ");
        int pages = readInt("Enter Number of Pages: ");
        String genre = readString("Enter Genre: ");
        double price = readDouble("Enter Price: ");
        int issue = readInt("Enter Issue Number: ");

        return new Magazine(id, title, pages, genre, price, issue, date);
    }

    private static int readInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    private static double readDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    private static String readString(String msg) {
        sc.nextLine();
        System.out.print(msg);
        return sc.nextLine();
    }
}