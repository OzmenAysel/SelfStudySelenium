package replits;

import java.util.Scanner;

public class A67_ReverseIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		if (word.length() == 5) {
			for (int i = word.length()-1; i >= 0; i--) 
				System.out.print(word.substring(i, i + 1));
			
		} else if (word.length() < 5) {
			System.out.println("Too short!");
		} else {
			System.out.println("Too long!");
		}

	}

}
