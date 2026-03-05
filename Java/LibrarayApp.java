package cdac;

public class LibrarayApp {

	public static void main(String[] args) {
		
		Date d = new Date("Thursday.", "05/03/2026");
		Book b = new Book(1,"Atmoic Habbits" ,220, "Self Help", 330, 23343, d, "James Clear");
		Magazine m = new Magazine(2, "Mars", 34, "Adult Bollywood", 55,  23464, d);
		
  }

}
