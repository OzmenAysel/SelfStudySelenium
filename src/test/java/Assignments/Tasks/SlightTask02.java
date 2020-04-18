package Assignments.Tasks;

import java.util.Scanner;


public class SlightTask02 {
	
	public static void main(String[] args) {
		
		// Write a program that asks user to enter three numbers and returns the largest number
		// Do it with ternary
		
		// With Ternary
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1");
		   double n1 = input.nextDouble(); 
		   
		System.out.println("Enter num2");
			double n2 = input.nextDouble();
			
		System.out.println("Enter num3");
			double n3 = input.nextDouble();
			
			double Largest = (n1 > n2 && n1 >n3) ? n1
							 : (n2 > n1 && n2 > n3) ? n2
							 : n3 ;
		
		System.out.println("Largest number is "+Largest);
		
		
		
		// With if Else
		Scanner number = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1, num2, num3;
		
		num1 = number.nextInt();
		num2 = number.nextInt();
		num3 = number.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("Largest number is : "+num1);
		}else if (num2>num1 && num2>num3) {
				System.out.println("Largest number is : "+num2);
		}else if (num3>num1 && num3>num2) {
			System.out.println("Largest number is : "+num3);
		}else {
			System.out.println(" ");
		
		
	
		}	
		
	}
	

}


/*




Write a program that asks user to enter first name and then last name.  At the end system should display user� full name
*/
