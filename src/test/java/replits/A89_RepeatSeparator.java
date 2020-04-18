package replits;

import java.util.Scanner;

public class A89_RepeatSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(), separator = scan.next();
		int count = scan.nextInt();

		String str = word;
		for (int i = 0; i < count - 1; i++)
			str = str + separator + word;

		System.out.print(str);

	}

}
