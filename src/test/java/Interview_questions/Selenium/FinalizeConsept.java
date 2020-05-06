package Interview_questions.Selenium;

// Naveen

public class FinalizeConsept {  // Finalize is a method. It is a garbage collection.
                                // It is used for cleanup processing before the garbage collector processing

    public void finalize(){
        System.out.println("finalize method");
    }

    public static void main(String[] args) {
        FinalizeConsept finalizeConsept1 = new FinalizeConsept();
        FinalizeConsept finalizeConsept2 = new FinalizeConsept();

        finalizeConsept1 = null;
        finalizeConsept2 = null;

        System.gc();
    }

}
