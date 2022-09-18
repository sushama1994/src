package Day2;

import java.util.Scanner;

public class OddEvenTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.println("Enter number:");
			int number = scan.nextInt();
			if (number % 2==0) {
				System.out.println("number is even.");
			}else {
				System.out.println("number is odd");		}
			
		}	
	}
}
