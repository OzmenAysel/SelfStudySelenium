package replits;

import java.util.Scanner;

public class A55_WeekDays {

	public static void main(String[] args) {
		// WRITE YOUR CODE HERE

		Scanner input = new Scanner(System.in);
		int day = input.nextInt();

		System.out.println("Enter number:");

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid enter!");

		}
		
	}

}
