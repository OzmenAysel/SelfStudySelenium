package Interview_questions.JavaQuestions.staticMethod;
// Naveen
public class TestCar {

    public static void main(String[] args) {
        // BMW class extends Car class. start() method is overridden.
        // If we call start method by using BMW class object s, overridden start method will be printed.
        BMW b = new BMW();
        b.start();  // BMW--start  --> NOT  Car--start  --> Dynamic Polymorphism
        b.stop();  // Car--stop
        b.refuel();  // Car--refuel
    }
}
