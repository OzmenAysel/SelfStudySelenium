package replits;

import java.util.Scanner;

public class A95_GetSandWich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next(), between = "nothing";

		if (str.indexOf("bread") != -1 ) 
			if(str.lastIndexOf("bread") != str.indexOf("bread"))
				between = str.substring(str.indexOf("bread") + 5,  str.lastIndexOf("bread"));
		
		System.out.println(between);
	}

}
