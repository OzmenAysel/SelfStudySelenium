package Assignments.Tasks;

public class Task_Sligh3 {
	
	public static void main(String[] args) {
		
		
		// task Watermelon:
	
		int numberOfWatermelon;
		boolean lotsOfWatermelon;
		lotsOfWatermelon=false;
		
		numberOfWatermelon=40;
		
		if(numberOfWatermelon>=20) {
			System.out.println("I have more than 20 watermelon");
			lotsOfWatermelon=true;
		}
		
		if(lotsOfWatermelon) {
			System.out.println("Good Job");
		}
		
		if(lotsOfWatermelon==false) {
			System.out.println("I need more watermelon");
		}
		
		
		
		// task oddOrEven:
		
		int number = 100;
		boolean even = number%2==0;
		
		
		if(even) {
			System.out.println(number+" is an even number");	
		}
		else {
			System.out.println(number+" is an odd number");
		}
		
		
		
		
		// task triangle:
		
		int angle1 =30, angel2 =45, angle3 =105;
		boolean valid = (angle1+angel2+angle3)==180;
		
		if(valid) {
			System.out.println("the triangle is valid");
		}
		else {
			System.out.println("it is invalid triangle");
		}
		
		
		
		/* task hour:
		  	1. 0~12 = Good Morning
		  	2. 12<= && 0~3 pm = Good Afternoon
		  	3. 3 pm >=0 = Good Evening
		  	
		
		 */
		
		int hour = -6;
		boolean validhour = hour>=0 && hour<=23;
		
	if(validhour){
		
		if(hour<12) {
			System.out.println("Good Morning");
		}
		else if(hour>=12 && hour<15) {
			System.out.println("Good Afternoon");	
		}
		else {
			System.out.println("Good Evening");
		}
	}
	else {
		System.out.println("invalid time");
	}
	
		
		
		
		// task largest number
		
		int num1=200, num2=3000, num3=5900;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the bigger");
		}
			else if(num2>num1 && num2>num3) {
				System.out.println(num2+" is the bigger"); 
		}
			else if(num3>num1 && num3>num2) {
				System.out.println(num3+" is the bigger");	
		}
		    else if (num3 == num2 && num3 > num1) {
		         System.out.println(num3+" and "+num2+" are the bigger number");
	    }  
		    else if(num3==num1 && num3 > num2) {
		         System.out.println(num3+" and "+num1+" are the bigger number");
		}
		    else if(num2 == num1 && num2 > num3) {
		         System.out.println(num2+" and "+num1+" are the bigger number");
		}
		    else {
		         System.out.println("all of them are equal");
		}
		       
		
		
	
		
		/* task marks:
		   1.If marks<60, than print "Fail"
		   2.If marks>=60, but less than 90, than print "Pass"
		   3.If marks>=90, than print "Passed with Distinction"
		 
		 */
		
		int mark = 190;
		
		if(mark<60) {
			System.out.println("Fail");
		}
		else if(mark>=60 && mark<90) {
			System.out.println("Pass");
		}
		else if(mark>90 && mark<=100) {
			System.out.println("\"Passed with Distinction\"");
		}
		else {
			System.out.println("it is not a valid mark");
		}
		
	
		
		/* task hour2:
	  	1. 0~12 = Good Morning
	  	2. 12<= && 0~3 pm = Good Afternoon
	  	3. 3 pm >=0 = Good Evening
	  	
	
	 */
	
	int hour2 = 0;
	boolean validtime = hour2>=0 && hour2<24;
	
	if(validtime) {

		if(hour2<12) {
			System.out.println("Good Morning");
		}
		else if(hour2>=12 && hour2<15) {
			System.out.println("Good Afternoon");	
		}
		else{
			System.out.println("Good Evening");
		}
	}
		else {
		System.out.println("it is not valid time");
	}
	
	
	
	
	/* task grade:
	 
	   90 <= grade <= 100 ==> A
       80 <= grade < 90 ==> B
       70 <= grade < 80 ==> C
       60 <= grade < 70 ==> D
             else  ==> F             
	 */
	
	int grade=90;
	
	if( 90 <= grade  && grade <= 100) {
		System.out.println("A");
		System.out.println();
	}
		else if( 80 <= grade && grade < 90 ) {
			System.out.println("B");
		}		
		else if(70 <= grade && grade < 80) {
			System.out.println("C");
		}
		else if( 60 <= grade && grade < 70 ) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
			
	}
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
