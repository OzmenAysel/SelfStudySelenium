package replits;

import java.util.Scanner;

public class A30_SecondsConverter {

	public static void main(String[] args) {
		// YOUR CODE HERE:
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds:");
		int inputSeconds = scan.nextInt();
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		seconds = inputSeconds % 60;
		minutes = inputSeconds / 60;
		hours = minutes / 60;
		if (minutes >= 60)
			minutes = minutes % 60;

		System.out.println(hours + " hours, " + minutes + " minutes, " + "and " + seconds + " seconds");

	}

}
