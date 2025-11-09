package OperatorConditonLoop;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public class PositiveOrNot {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter the number: ");
	    int Num = input.nextInt();
	    
		String Answers = ( Num>=0 ? "Positive" : "Negative");
			System.out.println(Answers);
	    	input.close();
	    }
	    
		}



}
