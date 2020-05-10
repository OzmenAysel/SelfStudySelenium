package Interview_questions.JavaQuestions.AbrstractionConcept;
// Naveen
public abstract class AbstractBank {

    int amount = 100;
    final int rate = 10;
    static int loanRate = 5;

    // partial abstraction --> Because we have to define loan();method in sub class --> OOP Concept
    // hiding the implementation logic --> Abstraction
    // Abstract class can have abstract and non-abstract methods
    // Can not create object of abstract classes

    public abstract void loan(); // abstract method

    // non abstract methods
    public void credit(){
        System.out.println("Bank-- Credit");
    }

    public void debit(){
        System.out.println("Bank-- Debit");
    }
}
