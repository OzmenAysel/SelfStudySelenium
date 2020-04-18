package SelfandRewiev;

import java.util.Arrays;
import java.util.Scanner;

public class replit149 {
			
			/*
			 *add_to_r is a method that gets an array and a number.
		
		the method creates a new array bigger by one then (int[] r).
		It populates the new array with the old ones(r) values.
		and finally in the last position adds the number (int n) to it.
		
		for example:
		
		method input: add_to_r(new int{1,5,77,8}  ,2)
		
		outputs (int array):
		[1, 5, 77, 8, 2]
			 */
	
	public static void add_to_r(int[] r,int n) {
		  int[] new_r = new int[r.length+1];
		      
		        for(int i =0; i<r.length;i++){
		            new_r[i]= r[i];
		        }
		        new_r[r.length] = n;
		       // System.out.println(n);
		        System.out.println(Arrays.toString(new_r));
		    }
		    
		  
		  public static void main(String[] args) {
		   System.out.println("Input size");
		    Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    System.out.println("input number");
		    int n = inp.nextInt();
		    System.out.println("input array ");
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++){

		        arr[i]=inp.nextInt();
		    }
		    
		     add_to_r(arr, n);
		   
		    /*
			     public static void main(String[] args) { 
	        int [] r = {1,2,3,4,5,6};
	        int n = 99;
	        add_to_r(r,n);
    }
		     */
		  }


}
