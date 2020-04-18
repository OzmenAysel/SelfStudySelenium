package JavaPractice.officeHour;

public class testAnimal {

	  
    public static void main(String[] args) {
        
        //some donate lion 
        Animal a201 = new Animal();
    //  a201.name = "Simba";
        a201.age = 3;
        a201.color = "brown";
        
        a201.eat();
        a201.sleep();
        
        
        Animal a202 = new Animal();
        a202.age = 1;
        a202.color = "gray";
        a202.name = "Lulu";
        
        a202.sleep();
        a202.eat();
        
        System.out.println(a202.name); //lulu
        System.out.println(a202.breed); 
        
        System.out.println(a201.name);
    }
	
	
}
