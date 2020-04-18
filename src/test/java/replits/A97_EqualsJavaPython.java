package replits;

import java.util.Scanner;

public class A97_EqualsJavaPython {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		int countJava = 0, countPython = 0;

		for (int i = 0; i < sentence.length() - 3; i++) {
			if (sentence.substring(i, i + 4).equals("java")) 
					countJava++;
		}
		
		for (int i = 0; i < sentence.length() - 5; i++) {
			if (sentence.substring(i, i + 6).equals("python")) 
					countPython++;
		}

		System.out.println(countJava == countPython);

	}

}
