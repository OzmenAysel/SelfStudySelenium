package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class MiddleCharacter {
	
			/*
			 *Write a Java method to display the middle character of a string. Go to the editor
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
		
		
		Input:
		Input a string: elephant her
		Output:
		
		The middle character in the string: ph
			 */

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = scan.nextLine();
		int num = word.length();
	
		if(num%2 == 0) {
			System.out.println(word.substring(num/2-1, num/2+1));
		}else if (num%2 == 1){
			System.out.println(word.substring(num/2, num/2+1));
		}
			
		}

}
		
		 
		 
		
			 
			 
		


		 
	

		 
		 
		
		
		
	
	

