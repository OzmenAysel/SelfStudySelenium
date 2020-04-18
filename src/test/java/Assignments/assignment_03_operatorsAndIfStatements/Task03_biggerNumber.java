package Assignments.assignment_03_operatorsAndIfStatements;

public class Task03_biggerNumber {
	public static void main(String[] args) {
		
// solution 1:
		
	    int n1=3, n2= 2, n3 = 30;    
	    
	    int maximum = 0;  // local variable must be initialized before use
	    
	    /* 
	     in order to n1 be the maximum :  n1 > n2 && n1 > n3
	     in order to n2 be the maximum :  n2 > n1 && n2 > n3
	     in order to n3 be the maximum :  n3 > n1 && n3 > n2
	    
	    */	
	
		if (n1>n2 && n1>n3) {
			maximum = n1;
		}
		
		if(n2 > n1 && n2 > n3) {
	        maximum = n2;
		}
		
		if (n3>n2 && n3>n1) {
			maximum = n3;
		}
		
		
String result = "Maximum number between "+n1+", "+n2+", "+n3+" and is: "+maximum;
System.out.println( result ); 



			//solution 2:

		if(n1 > n2 && n1 > n3) {
		    System.out.println("Maximum number is " +n1);
		}
		
		if (n2>n1 && n2 > n3) {
		    System.out.println("Maximum number is "+n2);
		}
		
		if(n3 > n1 && n3 > n2) {
		    System.out.println("Maximum number is "+n3);
		}		
				
		
		
		
		
		int A;
        if(true) {
            A=12;
        }
        System.out.println(A);// local variables MUST be initialized BEFORE USE
    
        
        
    
        double B;
    
        if(false) {
            B =100;
        }
    
	}

}
