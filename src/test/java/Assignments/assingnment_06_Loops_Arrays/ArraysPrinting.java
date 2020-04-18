package Assignments.assingnment_06_Loops_Arrays;

import java.util.Scanner;

public class ArraysPrinting {
	
	
	public static void main(String[] args) {
		
		/*
	 	Write a program that will take five Strings and save them into an array called arr. 
	     Print out the first three letter of each element of arr, one per line. 
	     You can assume that every element of arr is at least 3 letters long.
		
		Example:
		arr -> ["apple", "banana"]
		prints: app
		        ban
		 */
		
		
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		System.out.println("Enter a word which is have 3 or more letters");
		
		for(int i = 0; i<5; i++) {
			arr[i]=input.nextLine();
		}
		for(int i =0; i<5; i++) {
		System.out.println(arr[i].substring(0,3));
	}

		
		
		
		
		
	
		
		
		
		
	}

}
