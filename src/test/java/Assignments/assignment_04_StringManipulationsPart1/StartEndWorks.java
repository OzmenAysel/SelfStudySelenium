package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class StartEndWorks {
	/*
	 * Write a program StartEndWords: you have 2 words that must be 5 characters,
	 * and check if last letter of first word and first letter of second word are
	 * same. if either one not 5 chars length: print
	 * "need to be exactly 5 chars length" if last letter of 1st word and first
	 * letter of 2nd word match: print "Fizz" if they do not match: print
	 * "Buzz - did not match"
	 */
	
	public static void main(String[] args) {
		
	System.out.println("Enter two words");
		Scanner input = new Scanner(System.in);
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		
		if(word1.substring(4,word1.length()).equals(word2.substring(0,1))) {
			System.out.println("Fizz");
		}else {
			System.out.println("Buzz");
		}
	
			
			
	
		
		
		
	}
	
}


