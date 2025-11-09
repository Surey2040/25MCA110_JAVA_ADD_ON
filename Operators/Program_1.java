package OperatorConditonLoop;

import java.util.Scanner;

public class AlphapetOrNot {
	
	public class AlphapetORNot {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner Input = new Scanner(System.in);
				
				System.out.println("Enter the Char: ");
				
				char Alphapet = Input.next().charAt(0);
				
				
				String Alpha = (Alphapet >='a' || Alphapet >='z'|| Alphapet >='A' ||Alphapet >='Z' ? "Alphapet" : "Not a Alphapet");
				
				System.out.println(Alpha);
					Input.close();
			}
			
			
		}



		}



