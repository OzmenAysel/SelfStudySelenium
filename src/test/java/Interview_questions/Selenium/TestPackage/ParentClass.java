package Interview_questions.Selenium.TestPackage;

// Naveen

public class ParentClass {  // iIf we declare as public final class ParentClass {
                            // Child class can not extend it because it is a final class

    // to prevent inheritance
    // to prevent method overriding

    public final void start(){ // we can not override it Child class because is a final method
        System.out.println("parent --- start method");
    }
}
