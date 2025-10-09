package Conditional;
import java.util.Scanner;

public class EvenOrOdd {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			Scanner Input = new Scanner(System.in);
			
			System.out.println("Enter the number: ");
			int Num = Input.nextInt();
			
			if(Num %2==0) {
				System.out.println("the number is even");
		}
		  else if(Num % 2 != 0) {
			  System.out.println("The number is odd");
			  Input.close();
		  }
		}
}
		
	


