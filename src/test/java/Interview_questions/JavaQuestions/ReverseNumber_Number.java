package Interview_questions.JavaQuestions;

//Naveen_Albert

public class ReverseNumber_Number {

    public static void main(String[] args) {

        long number = 12345;

        reverseNumber1(number);
        System.out.println(reverseNumber2(number));
        System.out.println(reverseNumber3(number));
    }

    public static void reverseNumber1(long num){

        System.out.println(new StringBuffer(String.valueOf(num)).reverse());
    }

    public static long reverseNumber2(long num){
        long reverse =0;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num = num/10;
        }
        return reverse;
    }

    public static long reverseNumber3(long num){
        long reverse = 0;
        long remainder = 0;
        do{
            remainder =num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }while(num > 0);
            return reverse;
    }
}
