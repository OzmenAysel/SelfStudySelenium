package SelfandRewiev;

public class replit143 {
	
	
		 
	/*
	 Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
		*****
		*   *
		*   *
		*   *
		*****

hint:you will need to use two nested for loops for that, and an if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
	 */
		 
	// public static void printHollowRect(){
		    
		  //   for(int i=1; i<=5; i++){
		  //     if(i==1 || i==5){
		  //       System.out.println("*****");
		  //     }else{
		  //       System.out.println("*    *");
		  //     }
		  //   }
		  // }

	 public static void printHollowRect(int row, int column){
		  // for all size
		  for(int i=1; i<=row; i++){
		    for(int j=1; j<=column; j++){
		        if(i==1 || i==row || j==1 || j==column){
		            System.out.print("*");
		        }else{
		          System.out.print(" ");
		        }
		    }
		    System.out.println();   // MUST
		  }
		    }
		    
		  public static void main(String[] args) {
		   // printHollowRect();
		     printHollowRect(5,5);
		  }

}
