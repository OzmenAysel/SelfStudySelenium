package replits;

import java.util.Scanner;

public class A92_Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		long z = 1;
		
		for (int i = 1; i <= n; i++) 
			z = z * i;
		
		System.out.println(z);

	}

}
