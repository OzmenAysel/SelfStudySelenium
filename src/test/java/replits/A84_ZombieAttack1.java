package replits;

import java.util.Scanner;

public class A84_ZombieAttack1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt(),  day = 0;
		
		while (inhabitants != 0) {
			System.out.println("Day " + day + " [" + inhabitants + "]");
			day++;
			inhabitants /= 2;
		}
		
		System.out.println("---- EXTINCT ----");

	}

}
