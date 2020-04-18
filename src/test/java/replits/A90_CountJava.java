package replits;

import java.util.Scanner;

public class A90_CountJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		int count = 0;

		for (int i = 0; i < word.length() - 3; i++)
			if (word.substring(i, i + 4).equalsIgnoreCase("java"))
				count++;

		System.out.println(count);

	}

}
