package replits;

import java.util.Scanner;

public class A60_VerifyContains {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sentence = scan.nextLine();
		
		// WRITE YOUR CODE HERE

		if (sentence.contains(word) == true)
			System.out.println(true);

		else
			System.out.println(false);

	}

}
