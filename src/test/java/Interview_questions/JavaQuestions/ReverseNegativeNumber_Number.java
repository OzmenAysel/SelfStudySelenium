package Interview_questions.JavaQuestions;

public class ReverseNegativeNumber_Number {


//    Write a return method that can reverse negative number and return it as int

    public static void main(String[] args) {
        int num = -2106;
        System.out.println(reverseNum(num));

//        int number = 6789;
//        String str = new StringBuilder(""+number).reverse().toString();
//        System.out.println(str);
    }

//    Solution:
    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }
}
