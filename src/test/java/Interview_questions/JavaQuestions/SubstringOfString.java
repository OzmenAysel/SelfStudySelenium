package Interview_questions.JavaQuestions;

public class SubstringOfString {

        public static void main(String args[]) {
            String str="test";
            System.out.println("All substring of abbc are:");
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j <= str.length(); j++) {
                    System.out.println(str.substring(i,j));

                }
            }

        }



}
