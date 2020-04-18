package JavaPractice.officeHour;

public class OverLoading {
	
	//overLoading --> happen Same class
    //                1. same name
    //                2. Different parameter
    //                3. method type can be changed 
    public static void hi() {
        System.out.println("Hi, how are you?");
    }
    
    public static void hi(String name) {
        System.out.println("hi hi hi hi " + name);
    }
    
    public static String hi(String name ,String day) {
        return "Hi " + name + ", Have a good " + day;
    }   
    
    //can u overload main method?  YES 
    //give an example?
    
    public static void main() {
        System.out.println("fake main method");
    }
    
    public static String main(int num) {
        return "Your number is " + num;
    }
    
    
    public static void main(String[] args) {
        hi();
        hi("Asiya");
        
        System.out.println(hi("asiya", "Monday"));
        
        String greating = hi("Cybertek", "Sunday");
        System.out.println(greating);
        
        main();
        
        System.out.println( main(23) );
        
        
    }

}
