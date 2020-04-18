package JavaPractice.officeHour;

public class Return {
	


    /*return --> always promise give you one specific data type result
             -->  keyword: return 
     how to call a return method? 
        2 ways: 
        1: inside System.out.println( hello() );
        2:whatever the promised data type. assign the method to it
    */
    
    public static String hello() {
        return "Hi, good morning";
    }
    

    
    
    public static void main(String[] args) {
        
        //I want to call my return method 
        //there are two ways : 
        //1st one: 
        System.out.println( hello() );
                
        //what is data type that hello() method promised to return? 
        String greating = hello();
        System.out.println(greating);
        
    }
    
    
	
	
	
	
	
}
