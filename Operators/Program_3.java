package OperatorConditonLoop;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner Input = new Scanner(System.in);
			
			System.out.println("Enter a Number: ");
			
			int a = Input.nextInt();
			int b = Input.nextInt();
			int c = Input.nextInt();
			int d = Input.nextInt();
			
			
		int Num =( (a > b) ? (a > c) ? (a >d) ?a : d:(b > c)?(b > d)? b : d :(c > d)?(c > d)?c : d:c : d);
		
			System.out.println(Num );
			Input.close();
			
		}		
			}
		

	



