package Interview_questions.JavaQuestions;

// Naveen

public class RemoveJunkCharacters_RegularExpression_String {

    // How to remove Junk Characters
    // How to remove unwanted characters

    // we have to use
    //Regular Expression : [^a-zA-Z0-9]  ==> ^ means not  Bunu yazmazsak [] icindekiler gecerli yazarsak haric anlaminda
    public static void main(String[] args) {

        String s = "4 %^&*&($ String ()*))*!@ 0123";
        System.out.println(removeJunk(s));
    }

    public static String removeJunk(String str){

        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
