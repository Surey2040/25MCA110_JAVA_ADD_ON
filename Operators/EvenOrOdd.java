package OperatorConditonLoop;

import java.util.Scanner;

public class EvenOrOdd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			Scanner Input = new Scanner(System.in);
			
			System.out.println("Enter the Number: ");
			int Num = Input.nextInt();
			
			
			String Answer = (Num %2==0 ? "Even" : "odd");
			System.out.println(Answer);
			Input.close();
			
					

	}
	}



