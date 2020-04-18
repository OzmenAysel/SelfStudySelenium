package Assignments.Tasks;

import java.util.Arrays;

public class Task {

	
	public static void main(String[] args) {
		
		
		// print the entire 3d array:
				
		int[][][]  Array3D =  {    { {1,2}, {3,4} }  ,   { {5, 6}, {7, 8} }    };
					
				System.out.println(Arrays.deepToString( Array3D ));
				System.out.println(Arrays.deepToString(Array3D[1]));
				System.out.println(Arrays.deepToString(Array3D[0]));
				System.out.println(Arrays.toString(Array3D[0][0]));
				System.out.println(Arrays.toString(Array3D[1][0]));
					
				
				
				
		System.out.println("=================================================");			
					
		int[][][]  numbers3D = {  { {1,2} } , { {3,4} }   };	
				
		System.out.println(Arrays.deepToString(numbers3D));
		System.out.println(Arrays.deepToString(numbers3D[1]));
		//System.out.println(Arrays.toString(numbers3D[1][1]));
		
		
		
		
		System.out.println("=================================================");			
		
				
		//	4 dimensional array contains multiple 3 dimensional arrays
		int[][][][] numbers4D = {  {  { {1,2} } , { {3,4} }   }     , {  { {1,2} } , { {3,4} }   }      };	
			 
			System.out.println(Arrays.deepToString(numbers4D));
			System.out.println(Arrays.deepToString(numbers4D[1]));
			System.out.println(Arrays.deepToString(numbers4D[0]));
			System.out.println(Arrays.deepToString(numbers4D[1][1]));
			
	}
}
