package Interview_questions.JavaQuestions;
// Naveen
public class StringConcept {

    public static void main(String[] args) {

        // in memory created only one "Java".  It is the biggest advantage.
        // If we do debug, we will see that -->  str1 and str2 id name are same. value numbers are same.
        String str1 = "Java";
        String str2 = "Java";

        str2 = "Aysel";  // Now id number of str2 will change. it is pointing to "Aysel".
        String str3 = "C++";  // its id number will be different. value will be different (if we do debug, we can see)

        System.out.println(str1);
        System.out.println(str2);
    }
}
