package SelfandRewiev;

import java.util.Scanner;

public class replit115 {
	public static void main(String[] args) {
		
		
		/*
		 Given the array words, it will print the word with the largest length. 
		 Assume that there are no 2 words with longest length
		
		Example:
		words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
		prints jaaaaavvaaaaaaaaaa
		 */
		
		System.out.println("Enter words");
		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			
			for(int i = 0; i < 5;  i++) {
			  words[i] = input.nextLine();  
			}
			
		String largest = "";
		int max =0;
		
			for(int j =0; j<words.length; j++ ) {
				
				if(words[j].length()>max) {
					max=words[j].length();
					largest=words[j];
				}	
			}
			 System.out.println(largest);
			
			
		
	}

}
