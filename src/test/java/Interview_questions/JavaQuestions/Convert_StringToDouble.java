package Interview_questions.JavaQuestions;
//Albert
public class Convert_StringToDouble {

    public static void main(String[] args) {

        // To Convert String to Double
        String str = "88";
        System.out.println( Double.parseDouble(str) ); //88.0
        System.out.println( Double.valueOf(str) ); // 88.0

        // To Convert Double to String
        Double num = 7.9d;
        System.out.println(new StringBuilder().append(num).toString()); // 7.9
        System.out.println( num.toString() ); // 7.9
      //  System.out.println(String.valueOf(num)); // ????
    }

}
