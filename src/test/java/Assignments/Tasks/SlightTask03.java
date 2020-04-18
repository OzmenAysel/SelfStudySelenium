package Assignments.Tasks;

import java.util.Scanner;

public class SlightTask03 {
	
	public static void main(String[] args) {
		
		/*
	 	Write a program that asks user to enter first name and then last name.  
		At the end system should display user� full name.
		*/
		Scanner user = new Scanner(System.in);
		
		System.out.println("Write first name and last name");
		
		String firstname, lastname;
		firstname = user.nextLine();
		lastname = user.nextLine();
		
		System.out.println("User's full name : "+firstname+" "+lastname);
		
		
	/*	Scanner input = new Scanner(System.in);
		
		System.out.println("Write first name and last name");
		
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		
		String fullName=lastName+" "+firstName;
		
		
		System.out.println("User's full name : "+fullName);
	*/	
		
		
		user.close(); // gets rid of warning of the scanner class
		
		
	}

}
