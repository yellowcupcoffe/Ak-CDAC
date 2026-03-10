package Web;

import java.util.Stack;

public class WebPage {
	
	
	
	String url;
	
	
	public WebPage(String url) {
		this.url = url;
	}
	public String toString() {
	    return url;  // or whatever your field is called
	}
	
	
	
}


class webPageInternet{
	Stack<WebPage> Bstack = new Stack<>();
	Stack<WebPage> history = new Stack<>();
	
	void VisitPage(String url) {
		WebPage w = new WebPage(url);
		Bstack.push(new WebPage(url));
		history.push(new WebPage(url));
		System.out.println("Added " + url );
		System.out.println();
		
	}
	
	void GoBack() {
		if(!Bstack.isEmpty()) {
			System.out.println("Removed: " + Bstack.pop());
			System.out.println();
		}else {
		System.out.println("Can not go back this is the first page!");
		System.out.println();}
		}
	
	
	public void currentPage() {
		
		if(!Bstack.isEmpty()) {
			System.out.println("The current Page is: " + Bstack.peek() );
			System.out.println();
		} else {
			System.out.println("No Pages are Opened");
			System.out.println();
		}
	}
	
	void showHitory() {
		System.out.println("All Pages ever Visited: " + history );
		System.out.println();
	}
	
	
	
}