package replits;

import java.util.Scanner;

public class A62_PrintFirstLast {

	public static void main(String[] args) {
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	  String first= word.substring(0,1);
	  String last= word.substring(word.length()-1);
	  
	  System.out.println(first+last);

	}

}
