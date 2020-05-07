package Interview_questions.JavaQuestions;
// Albert
public class Polymorphism_Dynamic_Runtime{

}
    class Animal{
        void eat(){
            System.out.println("eating");
        }
    }

    class Dog extends Animal{
        void eat(){
            System.out.println("eating fruits");
        }
    }

    class BabyDog extends Dog{
        void eat(){
            System.out.println("drinking milk");
        }
        public static void main(String[] args) {

            Animal animal = new Animal();
            Animal dog = new Dog();
            Animal babyDog = new BabyDog();

            animal.eat(); // eating
            dog.eat(); // eating fruits
            babyDog.eat(); // drinking milk
        }
    }


