package Interview_questions.JavaQuestions;
// Albert
public class Polymorphism_Dynamic_Multilevel_Inheritance {

    }
    class Animals{
        void eat(){
            System.out.println("animals is eating");
        }
    }

    class Dogs extends Animals{
        void eat(){
            System.out.println("dog is eating fruits");
        }
    }

    class BabyDogs extends Dogs{

        public static void main(String[] args) {

            Animals animals = new BabyDogs();
            animals.eat();

        }
    }
