package Interview_questions.Selenium;

// Naveen

public class FinallyConsept { // finally is a block

    // finally block always executed
    // we should use it with try catch block

    public static void main(String[] args) {
     //   test1();
     //   test2();
        division();
    }

    public static void test1(){
        try{
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        }catch (Exception e){
            System.out.println("inside catch block");
        }
        finally {
            System.out.println("inside finally block");
        }
    }

    public static void test2() {
        try {
            System.out.println("inside test2 method");
        } finally {
            System.out.println("inside finally in test2 block");
        }

    }

    public static void division() {
        int i = 10;
        try {
            System.out.println("inside try block"); // if we write NullPointerException --> it will only print try and finally blocks
            int k = i/0;
        } catch (NullPointerException e){ // we can also write ArithmeticException
            System.out.println("inside catch block");   // --> so it will print all statements even inside catch block
            System.out.println("divide by zero error");
        }finally {
            System.out.println("execute this code even after any exception");
        }
    }



}
