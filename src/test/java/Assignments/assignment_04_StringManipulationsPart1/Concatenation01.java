package Assignments.assignment_04_StringManipulationsPart1;

import java.util.Scanner;

public class Concatenation01 {
	/*
	 * Ask user to enter two words. Then add them together and print.
	 * 
	 * Input:
	 * 
	 * one
	 * 
	 * eight
	 * 
	 * Output:
	 * 
	 * oneeight
	 
	 String a ="Cybertek";
					a.concat(" School"); //  "Cybertek School"
				System.out.println(a);
					a = a.concat(" School"); //  a= "Cybertek School"
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two words");
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		
		word1=word1.concat(word2);
		System.out.println(word1);
		
		
		
		}
		
		
		
	}
	
	

