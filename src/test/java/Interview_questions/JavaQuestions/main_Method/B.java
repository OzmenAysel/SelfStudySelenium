package Interview_questions.JavaQuestions.main_Method;
// Naveen
public class B {

    public static void main(String[] args) {
        System.out.println("B--main method");  // B--main method
        A.main(args);  // A--main method
    }

      // we can execute only A.main here or B.main in A class.
      // we can not execute both at the same time because parameters are same.

}
