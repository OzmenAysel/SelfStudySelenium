package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class CheckWords {
	/*
	 Write a program CheckWords:

Program accepts 3 words and :
- if they are same length: print "All words are same length"
- if some same length and others not: print "Not Same nor Different lengths"
- if all different length : print "All different length"
	 */

	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three words");
		String word1 =scan.nextLine();
		String word2 =scan.nextLine();
		String word3 =scan.nextLine();
		 
		int indexOfWord1 = word1.length();
		int indexOfWord2 = word2.length();
		int indexOfWord3 = word3.length();
		
		
	 if((indexOfWord1!=indexOfWord2 && indexOfWord2==indexOfWord3 ) ||
	 (indexOfWord1!=indexOfWord3 && indexOfWord1==indexOfWord2 ) ||
	 (indexOfWord2!=indexOfWord3 && indexOfWord1==indexOfWord3 )){
		 System.out.println("Not Same nor Different lengths");
	 } else if(indexOfWord1==indexOfWord2 && indexOfWord1==indexOfWord3 && indexOfWord2==indexOfWord3) {
				System.out.println("All words are same length");
		 }else {
				System.out.println("All different length");
		 }
		
	
		
			
			
			
		}
		
		
	}
			

