package Assignments.assignment_02_variables;

public class Task04_DeclareTwoVariables {
	
	public static void main(String[] args) {
	
	
			int a=10; //15
			int b=15; //10
			
			/*	
			a = b;  // a = 15
			b = a;   // b = 15
		   */	
			
			a = a + b;   // a =25;
			b = a - b;   // 25 -15 =10;    b=10;
			a = a - b;   // 25 -10 =15;     a = 15
			
			System.out.println(a+"\n"+b); //  15, 10
	
	
	
}
	

}
