package Conditional;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the Day: ");
		int Days = Input.nextInt();
		
		if(Days== 1) {
			System.out.println("Monday");
		}
		else if(Days==2) {
			System.out.println("Tursday");
		}
		else if(Days==3) {
			System.out.println("Wednesday");
		}
		else if(Days==4) {
			System.out.println("Thursday");
		}
		else if(Days==5) {
			System.out.println("Friday");
		}
		else if(Days==6) {
			System.out.println("Saturday");
		}
		else if(Days==7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid");
		}
		Input.close();
		
		

	}

}
