package JavaPractice.officeHour;

public class Animal {
	
	   //variables --> local variable  instance   static
    //local variable --> create inside method 
    //instance       --> outisde of method
    
    //information --> variable
    String name;
    int age;
    String breed;
    double weight;
    String color;
    
    //constructor  --> method 
    public Animal() {
        name = "This animal's name is not given";
        age =0;
        breed = null;
        weight = 0.0;
        color = "unkown";
    }
    
    
    
    
    
    //Action --> method 
    public void eat() {
        System.out.println("the animal is eating");
    }
    
    public void sleep() {
        System.out.println("the animal is sleeping");
    }


}
