package Interview_questions;

public class ConstructorConcept {

    String name;
    int age;

    public ConstructorConcept(){
        System.out.println("default const");
    }

    public ConstructorConcept(int i){
        System.out.println("1 par const");
        System.out.println(i);
    }

    public ConstructorConcept(int i, int j){
        System.out.println("2 par const");
        System.out.println(i+" "+j);
    }

    public ConstructorConcept(String name, int age){
        this.name=name; // this.class var = local var
        this.age=age;   // this.class var = local var
        // name=name1; // OR we can initialize with dif local var name
        // age=age2;

    }

    public static void main(String[] args) {
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(10, 20);
        ConstructorConcept obj3 = new ConstructorConcept("Aysel", 38);

        System.out.println(obj3.name); // OR we can write System.out.println(name); in the const
        System.out.println(obj3.age);  // OR we can write  System.out.println(age); in the const
    }
}
