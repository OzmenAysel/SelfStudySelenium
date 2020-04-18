package replits;

import java.util.Scanner;

public class A26_PositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int num = s.nextInt();

	    //your code here
	    if (num > 0) {
	      System.out.print("positive");
	    }  
	    if (num < 0) {
	      System.out.print("negative");
	    }
	    if (num == 0) {
	      System.out.print("zero");
	    }

	}

}
