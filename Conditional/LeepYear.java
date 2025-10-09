package Conditional;

import java.util.Scanner;

public class LeepYear {
	
public static void main(String[] args) {
		
		System.out.println("Enter the year: ");
		Scanner input = new Scanner(System.in);
		
		int Year = input.nextInt();
		
		if(Year % 4 == 0) {
			System.out.println("Its Leap Year");
		}
		else {
			System.out.println("Its not a leap year");
			input.close();
		}
		
		

	}

}
