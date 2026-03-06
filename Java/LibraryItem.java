package cdac;

public class LibraryItem {

    protected int itemId;
    protected String title;
    protected int numberPage;
    protected String genre;
    protected double price;
    protected double fine;
    protected int issueNum;
    protected Date issueDate;

    public LibraryItem(int itemId, String title, int numberPage,
                       String genre, double price, int issueNum, Date issueDate) {

        this.itemId = itemId;
        this.title = title;
        this.numberPage = numberPage;
        this.genre = genre;
        this.price = price;
        this.issueNum = issueNum;
        this.issueDate = issueDate;
    }

    public void calculateFine() {
        fine = price * 0.5;
    }

    public void display() {

        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + numberPage);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Issue Number: " + issueNum);
        System.out.println("Fine: " + fine);
        System.out.println("Issue Date: " + issueDate);
    }
}




 class Book extends LibraryItem {

    private String author;

    public Book(int itemId, String title, int numberPage,
                String genre, double price, int issueNum,
                Date issueDate, String author) {

        super(itemId, title, numberPage, genre, price, issueNum, issueDate);
        this.author = author;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}
 

  class Magazine extends LibraryItem {

     public Magazine(int itemId, String title, int numberPage,
                     String genre, double price, int issueNum, Date issueDate) {

         super(itemId, title, numberPage, genre, price, issueNum, issueDate);
     }
 }
 
 