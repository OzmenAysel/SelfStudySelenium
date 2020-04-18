package JavaPractice.officeHour;

import java.util.Scanner;

public class Return_01 {
	  //data types :1.primitive  --> byte short int long char boolean 
    /*            2.non-primitive  --> Scanner , String, Array, Wrapper class , ArrayList
     * 
     * method types: 1. void 
     *               2. return 
     * 
     * overLoading --> 
     */
    /*return --> always promise give you one specific data type result
             -->  keyword: return 
     how to call a return menthod? 
        2 ways: 
        1: inside System.out.println( hello() );
        2:whatever the promised data type. assign the method to it
    */
    
    public static String hello() {
        return "Hi, good morning";
    }
    
    //playGame () . provide length of the game, I will decide if I play or not
    public static boolean playGame(int minutes) {
        
        if(minutes <= 30) {
            return true;
        }
        return false;
    }
    
    
    
    
    public static void main(String[] args) {
        
        //I want to call my return method 
        //there are two ways : 
        //1st one: 
        System.out.println( hello() );
              
        //what is data type that hello() method promised to return? 
        String greating = hello();
        System.out.println(greating);
        
        
        //calling playGame method
        System.out.println(playGame(40));  //false
        
        //what data type will this playGame truth? 
        boolean playOrNot = playGame(25);
        System.out.println(playOrNot);
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How long does it take to play the game");
        int minute = scan.nextInt();
        
        System.out.println( playGame(minute) );
        
        
        boolean yesOrNo = playGame(minute);
        System.out.println(yesOrNo);
        
    }

}
