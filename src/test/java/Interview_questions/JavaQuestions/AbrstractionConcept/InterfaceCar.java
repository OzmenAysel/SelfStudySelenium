package Interview_questions.JavaQuestions.AbrstractionConcept;
// Naveen
public interface InterfaceCar {

    // only final and static variable we can define
    int wheels = 4;


    // always define only abstract methods
    // no method body, only method declaration
    // we achieve 100 % abstraction
    // Can not create object of interface

    public void start();
    public void stop();
    public void refuel();


}
