package Interview_questions.Java;

public class String_SumOfDigits_InAString {


//    Write a method that can return the sum of the digits in a string

//    Solution:

        public static void main(String[] args) {

            String str = "abc456def";
            System.out.println(sumOfDigits(str));
            System.out.println(sumOfDigits2(str));
        }

    public  static int  sumOfDigits(String s) {

        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

    public static int sumOfDigits2(String str) {//abc456def
        int sum=0;
        String[] c =str.split(""); //['a','b','c','4'...]
        String numbers="(.*[0-9].*)";
        for(String each:c) {
            if(each.matches(numbers)) {
                sum+=Integer.valueOf(""+each);
            }
        }
        return sum;
    }



}
