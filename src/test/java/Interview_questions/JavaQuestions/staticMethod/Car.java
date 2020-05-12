package Interview_questions.JavaQuestions.staticMethod;
// Naveen
public class Car {

    // can we override static method --> No But we can overload static method
    // We can override only instance

    public void start() { // example--> we override this method in BMW class. it can not be static
        System.out.println("Car--start");
    }
    /* if we declare start method as static, it will be hiding method.
    public static void start() {  --> METHOD HIDING
        System.out.println("Car--start");
    }  BMW extends this class but it also has static start method. So we can not reach it by using BMW class obj.
     */

    public void stop() {
        System.out.println("Car--stop");
    }

    public void refuel() {
        System.out.println("Car--refuel");
    }
}
