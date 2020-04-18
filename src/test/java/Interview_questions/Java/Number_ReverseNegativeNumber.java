package Interview_questions.Java;

public class Number_ReverseNegativeNumber {
//    Write a return method that can reverse negative number and return it as int
//
//
//
//    Solution:

    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }
}
