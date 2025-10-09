package Conditional;

import java.util.Scanner;

public class Date {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the DD/MM/YYYY: ");
		
		int Date = input.nextInt();
		int Month = input.nextInt();
		int Year = input.nextInt();
		
		
		if(Date<=31 && Month <=12 && Year <= 9999 ) {
			System.out.println("Its a valid DD/MM/YYYY: "+Date+"/"+Month+"/"+Year);
		}
		else {
			System.out.println("Its invalid");
			input.close();
		}
	}
}
