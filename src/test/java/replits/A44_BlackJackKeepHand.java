package replits;

import java.util.Scanner;

public class A44_BlackJackKeepHand {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int house = s.nextInt();
		int player = s.nextInt();

		// your code here
		if ((player + house) > 21)
			System.out.println("bust");
		else if (house > player)
			System.out.println("player loss");
		else if (house == player)
			System.out.println("its a tie");
		else
			System.out.println("player wins");

	}

}
