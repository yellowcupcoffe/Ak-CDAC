package cdac;

public class LibraryItem {
	
	int itemId;
	String title;
	int numberPage;
	String genre;
	double price;
	double fine;
	int issueNum;
	
	
	public LibraryItem(int itemId, String title, int numberPage, String genre, double price,
			int issueNum , Date d) {
		
		this.itemId = itemId;
		this.title = title;
		this.numberPage = numberPage;
		this.genre = genre;
		this.price = price;
		this.issueNum = issueNum;
	}


	public void DisplayLibItem() {
		
		System.out.println("Item ID: " + itemId );
		System.out.println("Title: " + title );
		System.out.println("Issue Number: "  + issueNum);
		System.out.println("Number of pages: " + numberPage );
		System.out.println("Genre: " + genre );
		System.out.println("Price: " +  price );
		System.out.println("Fine: " + fine );
		System.out.println("Issue Number: " + issueNum);
	}
	
	public void fineCal() {
		fine = price *(0.5);
	}
	
	
}


class Book extends LibraryItem {
	
	String Author;
	
	public Book(int itemId, String title, int numberPage, String genre, double price, int issueNum, Date d,
			String author) {
		super(itemId, title, numberPage, genre, price, issueNum, d);
		this.Author = author;
		
		this.fineCal();
		this.DisplayLibItem();
		this.displayAuthor();
		
	}

	public void displayAuthor() {
		
		System.out.println("Author of the Book: " + Author);
	}
	
}

 class Magazine extends LibraryItem {
	 
	 
	public Magazine(int itemId, String title, int numberPage, String genre, double price, int issueNum,
			Date d) {
		super(itemId, title, numberPage, genre, price, issueNum, d);
		
		this.fineCal();
		this.DisplayLibItem();
	}

 }