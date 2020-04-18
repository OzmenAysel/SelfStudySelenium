package SelfandRewiev;

import java.util.ArrayList;

public class replit166 {
	
	/*
		When gears merge and work together, one teeth from each one goes in order.
		Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
		
		s1 ==> "12345"
		s2 ==> "abcde"
		mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		
		mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		
		mergeStrings("java", "selenium") ==> "jsaevlaenium"
	 */

	public static String mergeStrings(String one, String two) {
		
		int maxsize = one.length()>two.length()? one.length():two.length();
		
		String str = "";
		
		for(int i=0; i<maxsize; i++) {
			if(i<one.length()) {
				str +=one.charAt(i);
			}if(i<two.length()) {
				str +=two.charAt(i);
		}
		}
		return str;
		
		
	}

   public static void main(String[] args) {
	   
	    System.out.println(mergeStrings("wooden", "spoon"));
		
	    System.out.println(mergeStrings("java", "selenium"));
}
}

