package Interview_questions.JavaQuestions.AbrstractionConcept;
// Naveen
public class TestInterfaceCar {

    public static void main(String[] args) {

        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();

        InterfaceCar c = new BMW();
        c.start();
        c.stop();
        c.refuel();
      //   c.theftSafety();  I can not access this method
    }
}
