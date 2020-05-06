package Interview_questions.JavaQuestions;

public class CountRepetitiveCertainWord_String {

    public static void main(String[] args) {

        // String[] names ={"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
        String str = "Aysel     Aysel Saadet     Fatma Fatma     fatma";
        FindDupElements(str);
    }


    public static void FindDupElements(String str) {  // worst approach  0(nxn) time complexity
        String[] result =str.trim().split("\\s+"); // Fazla bosluklarin onemsemez
        int count =0;
        for (int i = 0; i <result.length; i++) {
            if (result[i].equalsIgnoreCase("saaDET")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
