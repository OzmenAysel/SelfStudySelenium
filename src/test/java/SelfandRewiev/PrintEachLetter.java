package SelfandRewiev;

public class PrintEachLetter {
	
	public static void main(String[] args) {
		
		/*
			Aysel 
			Zeynep 
			Bera 
			Kadir 
		 */
		
		
		
		String [] word = {"Aysel", "Zeynep", "Bera", "Kadir"};
		
		for(int i=0; i<word.length; i++ ) {
			//System.out.println(word[i]);
			for(int j=0; j<word[i].length(); j++) {
				System.out.print(word[i].charAt(j));
			}
			System.out.println();
			
		}
		
		System.out.println("===============================");
		for(String each:word) {
			System.out.println(each);
		}
		
		
		}
		
		
		
		
		
}	   
		   
	
			  
		  
		 
		  
		    	  
		    	 
		    
		    
		    
		    
		
	
		
