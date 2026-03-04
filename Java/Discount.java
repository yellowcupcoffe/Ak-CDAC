package Java;
import java.util.Scanner;
public class Discount {
	
	public static float takePrice() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How Much Worth of Shopping you did: ");
		float price = sc.nextFloat();
		return price;
	}
	
	
	public static float getDiscPer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How much percent Discount Cuppon you have? : "   );
		float DiscPer = sc.nextFloat();
		return DiscPer;
	} 
	
	
	
	public static float TellDisc(float price, float DiscPer) {
		float Disc =(price * ((100-DiscPer) / 100 ));
		
		
		System.out.println("So your Price after Discount is " + Disc + ", you have saved: " + (price- Disc));
		return Disc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float priceA = takePrice();
		float DiscPer = getDiscPer();
		float Disc = TellDisc(priceA, DiscPer);
		
	}

}
