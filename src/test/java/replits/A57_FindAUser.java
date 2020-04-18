package replits;

import java.util.Scanner;

public class A57_FindAUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		String user1 = "max payne";
		String user2 = "alan wake";
		System.out.println("Enter full name:");
		String fullName = scan.nextLine().toLowerCase();
		
		if (fullName.equals(user1) || fullName.equals(user2))
			System.out.println("User found!");
		else
			System.out.println("User not found!");

	}

}
