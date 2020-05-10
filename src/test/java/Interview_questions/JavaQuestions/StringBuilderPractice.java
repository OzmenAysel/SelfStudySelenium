package Interview_questions.JavaQuestions;

public class StringBuilderPractice {

    public static void main(String[] args) {

        // not synchronized more efficient

        StringBuilder str = new StringBuilder("Aysel");
        str.append("Zeynep");   System.out.println(str);   // AyselZeynep
        str.delete(2,4);    System.out.println(str);   // AylZeynep
        str.replace(2,4, "BERA");    System.out.println(str);   //  AyBERAeynep


    }
}
