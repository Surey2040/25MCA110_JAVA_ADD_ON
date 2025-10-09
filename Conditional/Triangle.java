package Conditional;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the Angles: ");
		
		System.out.print("A: ");
		int A = Input.nextInt();
		System.out.print("B: ");
		int B =Input.nextInt();
		System.out.print("C: ");
		int C =Input.nextInt();

	
		if(A+B>C && A+C>B && C+B>A) {
			System.out.println("Triangle is possible");
		}
		else {
			System.out.println("Its Not Possible");
			Input.close();
		}
		
	}

}
