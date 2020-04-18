package SelfandRewiev;

public class replit120Shortest {
	public static void main(String[] args) {
		
		 String[] str = {"elma", "armut", "domatesssssss", "gg", "kkkkk", "hhhhhh"};
		    int min=1;
		    String shortest =str[0];
		    
		     for(int i=0; i<str.length; i++){
		        if(str[i].length()<shortest.length() ){ 
		        	shortest=str[i];
		        }
		        
		      }
		           System.out.println(shortest);
		           
		           
		           
		           System.out.println("====================");
		           
		           String myShort = str[0]; //assign it to the first word for now.
		           
	                
		            for(String Shortest : str)
		            {
		            if(Shortest.length() < myShort.length())
		            myShort = Shortest;
		            }
		            System.out.println(myShort);
		
	}

}
