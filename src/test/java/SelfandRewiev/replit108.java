package SelfandRewiev;
import java.util.Scanner;

public class replit108 {

		
			/*
		 Given a String variable email, write code using split method to print email id and domain in separate lines.
		
	Example:
	email -> info@cybertekschool.com
	Print:  
	Email id: info
	Email domain: cybertekschool.com
	
	
	If email contains no @ character or multiple @ characters then print invalid email:
	
	email -> hello-gmail.com
	print:  
	invalid email
	
	email -> my@fancy@email.com
	print:  
	invalid email
		 */
	public static void main(String[] args) {
	 System.out.println("Enter your email");
	   Scanner input = new Scanner(System.in);
	   String email = input.nextLine();
	   
	   //Write your code below
	   String[] arr = email.split("@");
	   String id =arr[0];
	   String domain =arr[1];
	 
      if(arr.length==1|| arr.length>2) {
		   System.out.println("invalid email");
	 	   
	   }else{
		   System.out.println("Email id: "+id);
		   System.out.println("Email domain: "+domain);
	   }
		   
	   
	  
   
   	// ayseltanzanya@gmail.com

	}
}

