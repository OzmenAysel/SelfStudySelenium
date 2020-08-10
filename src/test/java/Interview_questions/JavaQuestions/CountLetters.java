package Interview_questions.JavaQuestions;

public class CountLetters {

    public static void main(String[] args) {

        String str = "leeeevell";
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(result.contains(str.charAt(i)+""))
                continue;
            int count =0;
            for(int j=0; j<str.length(); j++) {
                if (str.charAt(i)==str.charAt(j))
                    count++;
            }
            System.out.println(str.charAt(i)+" --> "+ count);
            result+= str.charAt(i);

        }


    }
}
