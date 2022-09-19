package Day4;
import java.util.Scanner;
public class ProductDiscount{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the product name:");
		String product_name = scan.nextLine();
		System.out.print("Enter the product price:");
		float price = scan.nextFloat();
		if(price>=2000){
			float discount_price = (float)(price- price *10/100);
			System.out.println("Discounted price is 10% of price = " +discount_price);
		} else {
			float discount_price = (float)( price - price*7/100);
			System.out.println("discounted price is 7% of price = " +discount_price);
		}
		scan.close();
	}
}