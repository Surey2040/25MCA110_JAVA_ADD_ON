package Conditional;

import java.util.Scanner;

public class Identify {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the Char or Num: ");
		
		char word = Input.next().charAt(0);
	
		
	
		if(word >0) {
			System.out.println("The is Number");
		}
		else if(word >= 'a' || word <= 'z' && word >= 'A' || word <= 'Z') {
			System.out.println("this is Spl Char");
			Input.close();
		}
		

	}

}


