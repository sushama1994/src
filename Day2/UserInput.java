package Day2;
//wap to ask two numbers from user and print their sum 

 import java.util.Scanner; //in java its a predefined class

public class UserInput {

	public static void main(String[] args) {
		//system.in
		//system.out
		//system.err
		Scanner s= new Scanner(System.in);
		System.out.println("enter two numbers")		 ;
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c= a+b;
		System.out.println(c);
		
		
		s.close();
		
	}

}
