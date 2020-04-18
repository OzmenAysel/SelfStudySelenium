package SelfandRewiev;

public class RightPrint_DownPrint {
	
	public static void main(String[] args) {
		
		
		/*
			Aysel
			A 
			y 
			s 
			e 
			l 
			
			Zeynep
			Z 
			e 
			y 
			n 
			e 
			p 
			
			Bera
			B 
			e 
			r 
			a 
			
			Kadir
			K 
			a 
			d 
			i 
			r 
		 */
		
		
		String [] word = {"Aysel", "Zeynep", "Bera", "Kadir"};
			
			for(int i=0; i<word.length; i++ ) {
				System.out.println(word[i]);
				for(int j=0; j<word[i].length(); j++) {
					System.out.println(word[i].charAt(j)+" ");
				}
				System.out.println();
				
			}
			
			
			}
			
		
		
		
	

}
