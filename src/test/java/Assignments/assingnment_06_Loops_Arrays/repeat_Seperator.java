package Assignments.assingnment_06_Loops_Arrays;

import java.util.Scanner;

public class repeat_Seperator {

	
	public static void main(String[] args) {
		
				/*
				 Given two strings, word and a separator sep,
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		
		int count = scan.nextInt( );
		 
		return a big string made of count occurrences of the word, separated by the separator string.
		
		Example:
		input: Word
		input: X
		input: 3
		output: WordXWordXWord
		 
		Example:
		input: This
		input: And
		input: 2
		output: ThisAndThis
		 
		Example:
		input: This
		input: And
		input: 1
		output: This
				 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.next();
		System.out.println("Enter a seperator:");
		String seperator = scan.next();
		System.out.println("Enter a number:");
		int count =scan.nextInt();
		
		String[] output =new String[count*2-1];
			for(int i =0; i<output.length; i++ ) {
				
			if(i%2==0) 
				output[i]=word;
			
			
			else if (i%2==1)
				output[i]=seperator;		
				
				System.out.print(output[i]);
			}
			
		
					
				
			
			
		
	
	
		
	}			
				
		
	}

