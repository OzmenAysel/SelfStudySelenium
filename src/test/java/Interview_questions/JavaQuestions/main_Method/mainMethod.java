package Interview_questions.JavaQuestions.main_Method;
// Naveen
public class mainMethod {

    // JVM --> main (String[] args) -->  public static void
    public static void main(String[] args) {  // we can run only this method.
        System.out.println("main method-1");

        main("Testing");  // main method-2
        main(10); // main method-3
        main(4,5); //main method-4
    }

    public static void main(String args) {
        System.out.println("main method-2");
    }

    public static void main(int a) {
        System.out.println("main method-3");
    }

    public static void main(int a, int b) {
        System.out.println("main method-4");
    }
}
