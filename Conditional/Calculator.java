package Conditional;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the values: ");
		double A = Input.nextDouble();
		char ch = Input.next().charAt(0);
		double B = Input.nextDouble();
		
		
		
		
		double ans;
		
		switch (ch) {
		case '+':
			 ans = A+B;
			System.out.println(ans);
			break;
		case '-':
			ans= A-B;
			System.out.println(ans);
			break;
		case '*':
			ans= A-B;
			System.out.println(ans);
			break;
		case '%':
			ans= A-B;
			System.out.println(ans);
			break;
		case '/':
			ans= A-B;
			System.out.println(ans);
			break;
		
		}
		
		Input.close();

	}

}


