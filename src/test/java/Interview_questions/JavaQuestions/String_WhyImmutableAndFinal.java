package Interview_questions.JavaQuestions;
// Naveen
public class String_WhyImmutableAndFinal {

    public static void main(String[] args) {
        // Why String is immutable

        // 1. String Pool in Method Area
        // It is not create different two values.
        String str1 = "Java";
        String str2 = "Java";

        // Now create one more value.
        String str3 = "Selenium";

        str2 = "C++";
       /*
        2. Security --> if String is not immutable, inside the memory "C++" will be created,
         and then we are converting the value from "Java" to "C++".
         Same value will be given to str1, str2, str3... This is the biggest problem

        3. Class Loading Mechanism --> It can be change, so it will be a problem. If immutable No one can change
        4. Optimization & Performance --> For each string will need to create hashcode.
           If immutable no need to generate hashcode.
        5. Integer, Long, Double, Float --> All Wrapper classes are immutable and final.

         Why String is Final
         Final is used to prevent constant values and used to prevent to inheritance.
         So you can not override and you can not change
        */

    }
}
