package SelfandRewiev;

public class First_Last_Letter {
		public static void main(String[] args) {
		
		/*
		A l 
		Z p 
		B a 
		K r 
	 */
	
	
	
	String [] word = {"Aysel", "Zeynep", "Bera", "Kadir"};
	
	
	
	
	for(int i=0; i<word.length; i++ ) {
		//System.out.println(word[i]);
		for(int j=0; j<word[i].length(); j++) {
			if(j==0 || j==word[i].length()-1) {
			System.out.print(word[i].charAt(j)+" ");
		}
		}
		System.out.println();
	}
	
	
	
	
	
	
	}
	
	}
