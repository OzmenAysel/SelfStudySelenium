package Assignments.assignment_03_operatorsAndIfStatements;

public class Task05_number {
	
	public static void main(String[] args) {
		
		 /*
        number to be positive: number >0 
        number to be negative: number < 0
        number to be zero: number ==0
     
     */
    

	int number = 999 - 4000;
    String str ="zero";
    
    if( number > 0) {
        str ="positive";   
    }
    
    if(number < 0) {
        str ="negative";
        
    }
    
    System.out.println(number +" is "+str);
	
	
	
	
	
	
	
	int number2 = 2000;
	
	if ( number2>0) {
		System.out.println("positive");
	}
	
	if ( number2<0) {
		System.out.println("negative");
	}
	
	if (number2==0) {
		System.out.println("zero");
	}
	
	



	
	

	}

}
