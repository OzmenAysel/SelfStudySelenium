package SelfandRewiev;

import java.util.Arrays;
import java.util.Scanner;

public class replit121 {
	
	public static void main(String[] args) {
		/*
		Write a program that will find out shortest words in the given string str. 
		 If there are few words that are evenly short, print them all. 
		Use split method in order to split str string variable and create an array 
		of strings.  Print array with Arrays.toString() method. Sort array before printing. 
		 Split values by comma: split(", ");
		 input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
		 output: [cat, old, ray]
		*/
		
			Scanner scan = new Scanner(System.in);
		    String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
		    
		    String[] array = str.split(", ");
		    
		    
		    int minValue = 100;
		    for (int i = 0; i < array.length; i++){
		        
		      if (array[i].length() < minValue)
		        minValue = array[i].length();  
		    }
		    
		    int count = 0;
		    for (int i = 0; i < array.length; i++){
		      if (array[i].length() == minValue)
		        count++;
		    }
		    
		    String[] result = new String[count];
		    int j = 0;
		    for (int i = 0; i < array.length; i++){
		      if (array[i].length() == minValue){
		        result[j] = array[i];
		        j++;
		      }
		    }
		    Arrays.sort(result);
		    System.out.println(Arrays.toString(result));		
	}

}
