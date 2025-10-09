package Conditional;

import java.util.Scanner;

public class Time {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner Input = new Scanner(System.in);
			System.out.println("Enter Time");
			int time = Input.nextInt(); 
			int min = Input.nextInt();
			
				if(time<=24 && min<=60) {
					System.out.println("Valid time: " +time+":"+min);
					Input.close();
				}
	}

}


