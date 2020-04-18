package replits;

import java.util.Scanner;

public class A68_VerifyContains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(sentence.contains(word));

	}

}
