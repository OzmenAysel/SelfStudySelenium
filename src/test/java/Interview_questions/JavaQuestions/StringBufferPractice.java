package Interview_questions.JavaQuestions;

public class StringBufferPractice {

    public static void main(String[] args) {

        // synchronized
        StringBuffer str = new StringBuffer("Hello");
        str.append("Java");   System.out.println(str); // HelloJava
        str.insert(1, "PYHTON");   System.out.println(str);  // HPYHTONelloJava
        str.replace(1,3,"C++");    System.out.println(str);  // HC++HTONelloJava
        str.delete(1,3);   System.out.println(str);  // H+HTONelloJava
        str.reverse();   System.out.println(str);   // avaJolleNOTH+H



    }
}
