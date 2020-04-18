package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class DuplicateIt {
	
			/*
			 Ask user to enter two words. Print the first word, second word, second word, first word
		
		Input:
		
		one
		
		two
		
		Output:
		
		onetwotwoone
			 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter two names");
		 
		 String word1 = input.nextLine();
		 String word2 = input.nextLine();
		 
		 String output = word1.concat(word2)+word2.concat(word1);
		
		 System.out.println(output);
		 
	}

}
