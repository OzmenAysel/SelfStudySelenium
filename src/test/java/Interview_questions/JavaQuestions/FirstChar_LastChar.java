package Interview_questions.JavaQuestions;

public class FirstChar_LastChar {

    public static void main(String[] args) {
        String str = "Aysel";
        System.out.println(returnFirstChar(str)); // A
        System.out.println(returnLastChar(str)); // l
    }
    public static char returnFirstChar(String str ){
        return str.charAt(0);
    }

    public static char returnLastChar(String str ){
        return str.charAt( str.length()-1 );
    }
}
