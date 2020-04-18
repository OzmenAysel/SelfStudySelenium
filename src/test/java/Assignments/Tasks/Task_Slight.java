package Assignments.Tasks;

public class Task_Slight {
	
	/*
	 Task2 :
	 
	 	Write a jav aprogram that conversts gallons to liters
	 			1 gallon = 3.785 liters
	 			
	 	Write a java program that converts litters to gallons 
	 			 1 gallon = 3.785 liters
                 1 litter = 1/3.785
	  
	 */
	
	public static void main(String[] args) {
		
		//Task 2:
		
		int gallon = 1;
		double liters = gallon*3.785; // convert gallon to liters	
		String result1 = gallon +" gallons equal to "+liters+" liters";
		
		System.out.println(result1);
		
		
		double L = 100;
		double G = L/ 3.785; // 100/3.875
		String result2 = L +" liters equal to "+ G +" gallons";
		
		System.out.println( result2);
		
		
		
	    
        // Task1: 
        int x = 2;
        int y=  x++;  // y = 2; x=3
            //  post
        System.out.println(y+" "+x);
        
        
        int x2 =2;
        System.out.println( x2++ );  //2
        System.out.println( x2 );  // 3
        
        int x3 = 2;
        System.out.println( --x3 ); // 2-1=1
        
        
        int x4 =8;
        int y4 = x4--; // 8
        System.out.println( y4 );  //8
        System.out.println( x4 ); //7
		
		
		
		
		
		
	
		
		
		
	}

}
