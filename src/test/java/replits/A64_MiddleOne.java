package replits;

import java.util.Scanner;

public class A64_MiddleOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE
		int length = word.length();
		
		if ((length % 2 == 1) && (length >= 3)) {
			System.out.println(word.charAt((length - 1) / 2));
		} else if (length == 1) {
			System.out.println(word + word + word);
		} else if ((length % 2 == 0) && (length >= 4)) {
			System.out.println("" + word.charAt(length / 2 - 1) + word.charAt(length / 2));
		} else if (length == 2) {
			System.out.println(word + word);
		}

	}

}
