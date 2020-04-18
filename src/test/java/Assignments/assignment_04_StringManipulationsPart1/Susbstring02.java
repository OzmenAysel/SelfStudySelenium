package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class Susbstring02 {
	
			/*
			  Ask user to enter a word. 
			  If the first or second or both letter of the word is x,print the word without x(s). 
			  If x is the third letter it should be printed. 
			  If the first and second are x, both should be ignored.
		
		Input:
		
		xxode
		
		Output:
		
		ode
		
				Input:
				
				oxidex
				
				Output:
				
				oidex
					 */
		public static void main(String[] args) {
			
			System.out.println("Enter a word");
			
			Scanner scan = new Scanner(System.in);
			String word = scan.nextLine();
			
			if(word.startsWith("xx")){
				System.out.println(word.substring(2));		
			}else if(word.startsWith("x") || word.substring(1,2).equals("x")){
				System.out.println(word.replaceFirst("x",""));
			}else {
				System.out.println(word);
			}
	
}
	
	
}
