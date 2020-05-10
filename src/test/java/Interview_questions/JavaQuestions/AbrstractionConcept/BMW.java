package Interview_questions.JavaQuestions.AbrstractionConcept;
// Naveen
public class BMW implements InterfaceCar {

    @Override
    public void start() {
        System.out.println("BMW--start");
    }

    @Override
    public void stop() {
        System.out.println("BMW--stop");
    }

    @Override
    public void refuel() {
        System.out.println("BMW--refuel");
    }

    // non overridden method
    public  void theftSafety(){
        System.out.println("BMW--theftSafety");
    }


}
