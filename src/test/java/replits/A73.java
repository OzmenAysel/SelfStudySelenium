package replits;

import java.util.Scanner;

public class A73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    
	  String F = "First name: "+ email.substring(0,1).toUpperCase()+ email.substring(1,email.indexOf("_")) ;
	  String L ="Last name: "+ email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2,email.indexOf("@")) ;
	  String D = "Domain: "+ email.substring(email.indexOf("@")+1,email.indexOf("."));
	  String T = "Top-Level Domain: " + email.substring(email.indexOf(".")+1);
	  
	  System.out.println(F+"\n"+L+"\n"+D+"\n"+T);

	}

}
