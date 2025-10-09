package Conditional;

import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Input = new Scanner(System.in);
		
		
		
		System.out.println("Enter the Numbers: ");
		int Num1 = Input.nextInt();
		int Num2 = Input.nextInt();
		int Num3 = Input.nextInt();
		int Num4 = Input.nextInt();
		int Num5 = Input.nextInt();
		
		int max = Num1;
		
		if(Num2>max) {
			System.out.println("Maximum "+Num2);
		}
		else if(Num3>max) {
			System.out.println("maximum "+Num3);
			
		}
		else if(Num4>max) {
			System.out.println("Maximum "+Num4);
		}
		else if(Num5>max){
			System.out.println("Maximum "+Num5);
			Input.close();
		}	

	}

}


