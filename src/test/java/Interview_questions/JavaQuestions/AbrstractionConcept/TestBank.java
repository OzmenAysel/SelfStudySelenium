package Interview_questions.JavaQuestions.AbrstractionConcept;
// Naveen
public class TestBank {

    public static void main(String[] args) {

        HDFCBank hb = new HDFCBank();

        hb.credit();
        hb.debit();
        hb.loan();
        hb.funds();

        AbstractBank b = new HDFCBank();  // Dynamic Polymorphism
        b.credit();
        b.debit();
        b.loan();
        //  hb.funds(); We can not access this method because it in HDFCBank class.

     //    AbstractBank b1 = new AbstractBank();
    }
}
