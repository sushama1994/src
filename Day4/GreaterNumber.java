
package Day4;
import java.util.Scanner;
public class GreaterNumber{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int first_number = scan.nextInt();
		int second_number = scan.nextInt();
		if(first_number > second_number){
			System.out.println("First number is greater than second number.");
		}else if(first_number == second_number){
			System.out.println("Both number are equal.");
		}
		else {
			System.out.println("Second number is greater than first number.");
		}
	}
}