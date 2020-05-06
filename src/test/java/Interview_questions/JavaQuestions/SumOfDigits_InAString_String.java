package Interview_questions.JavaQuestions;

public class SumOfDigits_InAString_String {

//    Write a method that can return the sum of the digits in a string

//    Solution:
        public static void main(String[] args) {

            String str = "abc456def";
            System.out.println(sumOfDigits(str));
            System.out.println(sumOfDigits2(str));

            int num = 123456;
            System.out.println(sumOfDigits3(num));
        }

    public  static int  sumOfDigits(String s) {
        int sum = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                sum += Integer.valueOf(""+each);
            }
        }
        return sum;
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

    public  static int  sumOfDigits3(int num) {
        int sum = 0;
      while(num>0){
                sum += num%10;
                num =num/10;
            }
        return sum;
    }



}
