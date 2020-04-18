package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class Concatenation02 {

	/*
	 * Ask user to enter two words. Then add them together and print. But if the
	 * last letter if the first word and the first letter of the last letter is the
	 * same, print that character once.
	 * 
	 * Input:
	 * 
	 * one
	 * 
	 * eight
	 * 
	 * Output:
	 * 
	 * oneight
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two words");

		String word1; 
		String word2 ;
		String allword;
		String letterOne;
		String letterTwo;

		int lastLetter;
		boolean checkLetter;
		
		word1 = scan.nextLine();
		word2 = scan.nextLine();
		lastLetter = word1.length()-1;
		letterOne = word1.substring(lastLetter);
		letterTwo = word2.substring(0,1);
		checkLetter= letterOne.equals(letterTwo);
		
		if(checkLetter) {
			word2 = word2.substring(1);
		}
		allword=word1.concat(word2);
		
		System.out.println(allword);
	
		
		
		

	}

}

