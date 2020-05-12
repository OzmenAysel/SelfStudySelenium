package Interview_questions.JavaQuestions;

public class Palindrome_Number {

    public static void main(String[] args) {

        int num = 621;
        System.out.println(palindromeNum(num));
        System.out.println(palindromeNum2(151));
        System.out.println(palindromeNum3(151));

    }

    public static boolean palindromeNum(int number){
        String str = Integer.toString(number);
        String reverse = "";
        for( int i=str.length()-1; i>=0; i--)
            reverse+=str.charAt(i);
        return str.equalsIgnoreCase(reverse);
    }

    public static boolean palindromeNum2(int number){
        int palindrome = number;
        int reverse =0;
        while(palindrome !=0 ) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(number==reverse){
            return true;
        }
        return false;
    }

    public static boolean palindromeNum3(int number){
        int remainder= 0;
        int sum =0;
        int t =number;

        while(number > 0 ) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if(t==sum){
            return true;
        }
        return false;
    }
}
