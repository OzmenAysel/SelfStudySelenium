package SelfandRewiev;

import java.util.Scanner;

public class rectangleRow {
	
	public static void main(String[] args) {
		
		/*
		 you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rect row is "x  x"

			for example:
		
		n = 2
		
		xxx
		x  x
		x  x\
		xxx
		
		
		n=3
		
		xxx
		x  x
		x  x\
		x  x\
		xxx
				 */
		 
		
		System.out.println("Enter");
		Scanner s = new Scanner(System.in);
				
		int n = s.nextInt();
		
		String rect = "xxx\n";
		for(int i= 1; i<=n; i ++) {
		rect+="x x\n";
		}
			rect+="xxx";
		System.out.println(rect);
		
		
		
		    }
	}


