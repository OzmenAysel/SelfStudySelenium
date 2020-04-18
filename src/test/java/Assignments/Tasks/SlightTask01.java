package Assignments.Tasks;

import java.util.Scanner;

public class SlightTask01 {
	
	public static void main(String[] args) {
	
		// Write a program that calculates the sum of two numbers entered by the user
		
		 Scanner input =new Scanner (System.in);
		 System.out.println("Enter two integer value");
		 
		 int num = input.nextInt();
		 int num2 = input.nextInt();
		 
		 
		 System.out.println("Sum of two numbers : "+(num+num2));
		 
		
		 /*
		 
		Scanner input = new Scanner(System.in);
		  
		System.out.println("Enter the first number");
					int n1 = input.nextInt();
					
		System.out.println("Enter the second number");
					int n2 = input.nextInt();
					
		System.out.println("The sum is: " + (n1+n2) );
		
		  */
	}

}
