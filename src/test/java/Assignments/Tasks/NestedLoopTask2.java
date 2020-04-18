package Assignments.Tasks;

import java.util.Scanner;

public class NestedLoopTask2 {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter two number");
			int a = scan.nextInt();
			int b = scan.nextInt();  // 9 Enter
			System.out.println("Multiplication is: " + (a*b));
			System.out.println("Do you wanna continue?");
				scan.nextLine();
			 String answer =scan.nextLine().toLowerCase();
			 
			 while( !( answer.equals("yes")|| answer.equals("no") )  ) {
				 System.out.println("Please make up your mind");
				 System.out.println("Do you wanna continue?");
				 	answer =scan.nextLine();
			 }
		 
			 if(answer.equals("no")) {
				 break;
			 }
		}
	
	
	
	/*
	 calculator program:
	write a program that asks user user if he/she wants to: *, / , %, - , +
	 
	 then ask user to enter two number
	 
	 then return the result to the console
	 
	 and then ask the user if they wanna continue to do another math
	 if yes ==> repeat the previous steps,
	 if no ==> exit the system
	 other wise ==> ask the user to re enter 
	 
	 
	 
	 */
	}

}
