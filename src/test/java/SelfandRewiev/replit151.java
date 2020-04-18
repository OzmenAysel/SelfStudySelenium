package SelfandRewiev;

import java.util.Scanner;

public class replit151 {
	/*
	 Write a void method printUniqueNumbers that will print unique numbers 
	 from an array of ints.

	Example:
	input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
	output:
	2
	9
	34
	 */
	
	/*
	 public static void main(String[] args) {
        int [] arr = {2, 5, 5, 6, 3, 6, 9, 34, 3};
      printUniqueNumbers(arr);
    }
	 */
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] arr = new int[size];
	    for(int i=0; i < size; i++){
	      arr[i] = scan.nextInt();
	    }
	    printUniqueNumbers(arr);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    //WRITE YOUR CODE HERE
	    
	    for(int each : nums){
	      int count =0;
	      for(int each2 : nums){
	        if(each==each2){
	          count++;
	        }
	      }if(count==1){
	        System.out.println(each);
	      }
	    }
	    
	    
	  }

}
