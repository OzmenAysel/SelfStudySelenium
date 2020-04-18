package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class Susbstring01 {
	
		/*
		 Ask user to enter a word. If the word contains starts with x, print the word without x.
	
	Input:
	
	xcode
	
	Output:
	
	code
		 */

	public static void main(String[] args) {
		
		System.out.println("Enter a word");
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		if(word.startsWith("x")) {
			System.out.println(word.substring(1));
			
		}
		
		
	}
	
}
